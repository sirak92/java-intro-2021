package homework16;

import java.util.Arrays;

public class ArrayListDemo<E> {
    private Object[] array;
    private static final int DEFAULT_CAPACITY = 16;
    private int size;

    public ArrayListDemo() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            return -1;
        }
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayListDemoIndexOutOfBounds();
        }
        return (E) array[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= this.size) {
            throw new ArrayListDemoIndexOutOfBounds();
        }
        E prev = (E) array[index];
        array[index] = element;
        return prev;
    }

    public boolean add(E e) {
        insureCapacity();
        array[size++] = e;
        return true;
    }

    public void add(int index, Object element) {
        if (index < 0 || index >= this.size) {
            throw new ArrayListDemoIndexOutOfBounds();
        }
        insureCapacity();
        size++;
        System.arraycopy(array, index, array, index + 1, size - 1 - index);
        array[index] = element;
    }

    public E remove() {
        if (isEmpty()) {
            return null;
        }
        E toRemove = (E) array[size - 1];
        array[--size] = null;
        return toRemove;
    }

    public E remove(int index) {
        if (index < 0 && index >= this.size) {
            throw new ArrayListDemoIndexOutOfBounds();
        }
        E toRemove = (E) array[index];
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return toRemove;
    }

    public boolean remove(E o) {
        if (contains(o)) {
            remove(indexOf(o));
            return true;
        }
        return false;
    }

    private void insureCapacity() {
        if (size == array.length) {
            Object[] newArray = new Object[this.array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public String toString() {
        return "ArrayListDemo { array = " + Arrays.toString(this.array) + ", size = " + this.size + " }";
    }
}

class ArrayListDemoIndexOutOfBounds extends RuntimeException {
    private String msg;

    public ArrayListDemoIndexOutOfBounds() {
        super();
    }

    public ArrayListDemoIndexOutOfBounds (String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "DynamicArrayIndexOutOfBoundsException{"  + msg  + '}';
    }
}

