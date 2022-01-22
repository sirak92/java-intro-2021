package homework15;

public class StackGeneric<T> {
    private Object[] stack;
    private int tos = -1;
    private static final int DEFAULT_CAPACITY = 16;

    public StackGeneric() {
        this(DEFAULT_CAPACITY);
    }

    public StackGeneric(int capacity) {
        stack = new Object[capacity];
    }

    public void push(T element) {
        insureCapacity();
        stack[++tos] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new StackException("Stack is empty: ");
        }
        T toPop = (T) stack[tos--];
        return toPop;
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    private void insureCapacity() {
        if (tos == stack.length - 1) {
            Object[] newStack = new Object[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
    }

    public void printStack() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("{ ");
        for (int i = 0; i <= tos; i++) {
            if (stack[i].equals(stack[tos])) {
                System.out.print(stack[i]);
            } else {
                System.out.print(stack[i] + ", ");
            }
        }
        System.out.println(" }");
    }
}

class StackException extends RuntimeException {
    private String message;

    public StackException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{ " + this.message + " }";
    }
}
