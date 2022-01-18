import java.util.Scanner;

public class LambdaDemo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = console.nextLine();

        StringOperations palindrome = testStr -> {
            int i = 0;
            int j = testStr.length() - 1;
            while (i < j) {
                if (testStr.charAt(i) != testStr.charAt(j))
                    return false;

                i++;
                j--;
            }
            return true;
        };

        StringOperations upperCase = testStr -> {
            char[] array = testStr.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (Character.isLowerCase(testStr.charAt(i))) {
                    return false;
                }
            }
            return true;
        };

        StringOperations sameElements = testStr -> {
            int index = 0;
            while (index < testStr.length()) {
                if (testStr.charAt(0) != testStr.charAt(index))
                    return false;

                index++;
            }
            return true;
        };
        meth1(str, palindrome);
        meth2(str, sameElements);
        meth3(str, upperCase);

    }

    static public void meth1(String s, StringOperations o) {
        if (o.test(s)) {
            System.out.println("Is palindrome");
            return;
        }
        System.out.println("Is not palindrome");

    }

    static public void meth2(String s, StringOperations o) {
        if (o.test(s)) {
            System.out.println("Elements are the same");
            return;
        }
        System.out.println("Elements aren't the same");
    }


    static public void meth3(String s, StringOperations o) {
        if (o.test(s)) {
            System.out.println("Elements are uppercase");
            return;
        }
        System.out.println("Elements aren't uppercase");
    }
}

@FunctionalInterface
interface StringOperations {
    boolean test(String str);
}

