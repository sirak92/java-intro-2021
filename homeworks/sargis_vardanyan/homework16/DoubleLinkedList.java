package homework16;

public class DoubleLinkedList<E> {
    private Node<E> head;
    private int size;

    public DoubleLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public Node<E> getHead(){
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

    static class Node<E> {
        E value;
        Node<E> next;
        Node<E> previous;

        public Node(E value){
            this.value = value;
        }
    }

    public void add(E newElement){
         if (size == 0) {
             this.head = new Node<>(newElement);
         } else {
             Node<E> newNode = new Node<>(newElement);
             Node<E> last = head;
             for (int i = 0; i < size - 1; i++) {
                 last = last.next;
             }
             last.next = newNode;
             newNode.previous = last;
         }
        size++;
    }

    public void add(int index, E newElement) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            Node<E> newNode = new Node<>(newElement);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else if (index == this.size) {
            Node<E> newNode = new Node<>(newElement);
            Node<E> last = head;
            for (int i = 0; i < size - 1; i++) {
                last = last.next;
            }
            last.next = newNode;
            newNode.previous = last;
        } else {
            Node<E> newNode = new Node<>(newElement);
            Node<E> indexedNode = head;
            Node<E> indexedNext = head.next;
            for (int i = 0; i < index - 1; i++) {
                indexedNode = indexedNode.next;
                indexedNext = indexedNext.next;
            }
            newNode.next = indexedNext;
            indexedNext.previous = newNode;
            indexedNode.next = newNode;
            newNode.previous = indexedNode;
        }
        size++;
    }

    public boolean remove() {
        if (this.size == 0) {
            return false;
        } else if (head.next == null) {
            head = null;
            size--;
            return true;
        }
        Node<E> last = head;
        for (int i = 1; i < size - 1; i++) {
            last = last.next;
        }
        last.next = null;
        size--;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        } else if (head.next == null) {
            head = null;
            return true;
        } else if (index == 0) {
            head = head.next;
            head.previous = null;
            size--;
            return true;
        } else if (index == size) {
            Node<E> last = head;
            for (int i = 0; i < size - 1; i++) {
                last = last.next;
            }
            last.next = null;
            size--;
            return true;
        }
        Node<E> indexed = head;
        Node<E> indexedNext = head;
        for (int i = 0; i < index - 1; i++) {
            indexed = indexed.next;
            indexedNext = indexed.next;
        }
        indexedNext = indexedNext.next;
        indexed.next = indexedNext;
        indexedNext.previous = indexed;
        size--;
        return true;
    }

    public void print() {
        Node<E> current = head;
        System.out.print("list { ");
        for (int i = 0; i < size; i++) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("} ");
    }

}
