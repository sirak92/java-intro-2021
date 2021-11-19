package homeworks.sargis_vardanyan;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // set: "Numbers that can be devided by 3 and are in rang of [1,100]"
        //  "The program checks if the set contains the entered digit"

        Scanner enteredDigit = new Scanner(System.in);
        int a;
        boolean isBelong;
        System.out.println("Enter a digit: ");
        a = enteredDigit.nextInt();
        isBelong = (a % 3) == 0 && a > 0 && a <= 100;
        System.out.println("The digit belongs to the set: " + isBelong);

    }
}
