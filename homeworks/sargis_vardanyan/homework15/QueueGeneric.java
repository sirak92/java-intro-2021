package homework15;

public class QueueGeneric<E> {
    private Object[] queue;
    private static final int DEFAULT_CAPACITY = 16;
    private int head = -1;
    private int size = 0;

    public QueueGeneric() {
        this(DEFAULT_CAPACITY);
    }

    public QueueGeneric(int capacity) {
        queue = new Object[capacity];
    }

    //Inserts the specified element into this queue
    // if it is possible to do so immediately without violating capacity restrictions,
    // returning true upon success and throwing an IllegalStateException if no space is currently available.
    public boolean add(E element) {
        if (size == queue.length) {
            throw new IllegalStateException("No space is currently available.");
        } else if (head == -1) {
            queue[++head] = element;
            size++;
            return true;
        }
        queue[size++] = element;
        return true;
    }

    //Retrieves, but does not remove, the head of this queue.
    public E element() {
        if (head == -1) {
            throw new IllegalStateException("Queue is empty.");
        }
        return (E) queue[head];
    }

    //Inserts the specified element into this queue
    // if it is possible to do so immediately without violating capacity restrictions.
    public boolean offer(E element) {
        if (size == queue.length) {
            return false;
        }
        queue[size++] = element;
        return true;
    }

    //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    public E peek() {
        if (head == -1) {
            return null;
        }
        return (E) queue[head];
    }

    //Retrieves and removes the head of this queue, or returns null if this queue is empty.
    public E poll() {
        if (head == -1) {
            return null;
        }
        return remove();
    }

    //Retrieves and removes the head of this queue.
    public E remove(){
        E toRemove = (E) queue[head];
        System.arraycopy(queue,1, queue, 0, queue.length - 1);
        return toRemove;
    }
}
