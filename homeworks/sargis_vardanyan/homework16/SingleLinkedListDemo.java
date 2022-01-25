package genericsDemo;

public class SingleLinkedListDemo<E> {
    private Node head;

    public SingleLinkedListDemo() {
        this.head = null;
    }

    class Node {
        E value;
        Node next;

        private Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(E newElement) {
        Node newNode = new Node(newElement);

        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void add(int index, E newElement) throws IndexOutOfBoundsException{
        Node toAdd = new Node(newElement);
        if (index == 0) {
            Node currentHead = head;
            head = toAdd;
            toAdd.next = currentHead;
            return;
        }
        Node indexed = head;
        for (int i = 1; i < index; i++) {
            indexed = indexed.next;
        }
        toAdd.next = indexed.next;
        indexed.next = toAdd;
    }

    public void remove() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }
        Node last = head;
        while (last.next.next != null) {
            last = last.next;
        }
        last.next = null;
    }

    public void remove(int index) {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }
        Node indexed = head;
        for (int i = 0; i < index; i++) {
            indexed = indexed.next;
        }
        indexed.next = indexed.next.next;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current.next != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println(current.value);
    }

}

class Test {
    public static void main(String[] args) {
        SingleLinkedListDemo<Integer> list = new SingleLinkedListDemo<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        list.add(3, 10);
        list.printList();
        list.remove(2);
        list.printList();
    }
}