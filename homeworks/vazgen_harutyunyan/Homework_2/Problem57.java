import java.util.Scanner;
public class Problem57 {
    public static void main(String[] args) {
        int number;
        int number1;
        int firstDigit;
        int secondDigit;
        int lastDigit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        number1 = number;
        lastDigit = number % 10;
        number = number / 10;
        secondDigit = number % 10;
        number = number / 10;
        firstDigit = number;
        if(number1 > 300) {
            System.out.println(secondDigit / (double)lastDigit);
        } else {
            System.out.println(firstDigit / (double)lastDigit);
    }
}
}
