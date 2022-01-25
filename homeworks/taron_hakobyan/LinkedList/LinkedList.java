
public class LinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(36);
        linkedList.add(147);
        linkedList.add(121);
        linkedList.addIndex(2, 26);
        linkedList.showLinkedList();
        System.out.println();
        linkedList.remove();
        linkedList.showLinkedList();
    }
}

//Single LinkList//
class MyLinkedList<E> {
    private Node head;

    class Node {
        Node next;
        E value;

        Node(E value) {
            this.value = value;
        }
    }

    public void add(E value) {
        Node newNode = new Node(value);
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

    public void showLinkedList() {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
    }

    public void addIndex(int index, E value) {
        Node newElemnet = new Node(value);
        Node last = head;
        Node last2 = head;
        for (int i = 0; i < index - 1; i++) {
            last = last.next;

        }
        for (int i = 0; i < index; i++) {
            last2 = last.next;
        }
        last.next = newElemnet;
        newElemnet.next = last2;

    }

    public void removeIndex(int index) {
        Node last = head;
        Node last2 = head;
        for (int i = 0; i < index - 1; i++) {
            last = last.next;
        }
        for (int i = 0; i < index + 1; i++) {
            last2 = last2.next;
        }
        last.next = last2;
    }

    public void remove() {
        Node last = head;
        while (true) {
            last = last.next;
            if (last.next.next == null) {
                last.next = null;
                break;
            }
        }
    }

}