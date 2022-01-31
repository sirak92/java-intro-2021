package homework16;

public class SingleLinkedListDemo<E> {
    private Node<E> head;
    private int size;

    public SingleLinkedListDemo() {
        this.head = null;
        this.size = 0;
    }

    static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(E newElement) {
        Node<E> newNode = new Node<>(newElement);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node<E> last = head;
//        while (last.next != null) {
//            last = last.next;
//        }
        for (int i = 0; i < size - 1; i++) {
            last = last.next;
        }
        last.next = newNode;
        size++;
    }

    public void add(int index, E newElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> toAdd = new Node<>(newElement);
        toAdd.next = head;
        if (index == 0) {
            head = toAdd;
            size++;
        } else {
            Node<E> indexed = head;
            for (int i = 1; i < index; i++) {
                indexed = indexed.next;
            }
            toAdd.next = indexed.next;
            indexed.next = toAdd;
            size++;
        }
    }

    public boolean remove() {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            head = null;
            size--;
            return true;
        }
        Node<E> last = head;
//        while (last.next.next != null) {
//            last = last.next;
//        }
        for (int i = 1; i < size - 1; i++) {
            last = last.next;
        }
        last.next = null;
        size--;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (head == null) {
            return false;
        } else if (head.next == null) {
            head = null;
            return true;
        }
        Node<E> indexed = head;
        for (int i = 0; i < index - 1; i++) {
            indexed = indexed.next;
        }
        indexed.next = indexed.next.next;
        return true;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        Node<E> current = head;
        System.out.print("List: ");
//        while (current.next != null) {
//            System.out.print(current.value + " ");
//            current = current.next;
//        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println(current.value);
    }

    public int getSize() {
        return this.size;
    }

}
