import java.util.Scanner;
public class Problem53 {
    public static void main(String[] args) {
        int number;
        int number1;
        int k;
        int firstDigit;
        int secondDigit;
        int lastDigit;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        number1 = number;
        System.out.print("Enter second number");
        k = scanner.nextInt();
        lastDigit = number % 10;
        number = number / 10;
        secondDigit = number % 10;
        number = number / 10;
        firstDigit = number;
        sum = firstDigit + secondDigit + lastDigit;
        if(number1 > k) {
            System.out.println(number1 / sum);
        } else {
            System.out.println(lastDigit / (double)number1); // Change cast options.
    }
}
