import java.lang.reflect.Array;
import java.util.Arrays;

public class ListImpl {

    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<>();
        myList1.add(12);
        myList1.add(11);
        //myList1.showList();
        myList1.add(110);
        myList1.add(74);
        //myList1.showList();
        //myList1.get(12);
        //myList1.remove(11);
        //myList1.showList();
        myList1.add(34);
        myList1.add(26);
        myList1.add(57);
        myList1.add(87);
        myList1.showList();
        myList1.remove(3);
        myList1.showList();
        myList1.add(new Integer[]{333, 54, 198});
        myList1.showList();
        System.out.println(myList1.contains(333));
        myList1.showList();
    }
}

class MyList<T> {
    private T[] arrayList = (T[]) new Object[100];
    private int size;

    public void add(T t) {
        arrayList[size] = t;
        size++;
    }

    public void add(T[] ts) {
        for (int i = size, j = 0; i < size + ts.length; i++, j++) {
            arrayList[i] = ts[j];
        }
        size += ts.length;
    }

    public T get(T t) {
        for (int i = 0; i < size; i++) {
            if (arrayList == t) {
                return t;
            }
        }
        return null;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            System.out.println("Out of bound");
            return null;
        }
        return arrayList[index];
    }

    public void remove(T t) {
        for (int i = 0; i < size; i++) {
            if (arrayList[i] == t) {
                for (int j = i; j < size - 1; j++) {
                    arrayList[j] = arrayList[j + 1];
                }
                size--;
                return;
            }
        }
        return;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        size--;
        return;
    }

    public void showList() {
        for (int i = 0; i < size; i++) {
            System.out.print(arrayList[i] + " ");
        }
        System.out.println();
    }
    public boolean contains(T t){
        for (int i = 0; i <size ; i++) {
            if (arrayList[i]==t){
                return true;
            }
        }
        return false;
    }
    public boolean isEmpty(){
        if (size!=0){
            return false;
        }
        return true;
    }
    public void clear(){

    }
}
