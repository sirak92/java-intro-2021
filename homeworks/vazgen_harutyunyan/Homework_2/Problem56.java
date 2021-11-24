import java.util.Scanner;
public class Problem56 {
    public static void main(String[] args) {
        int number;
        double number1;
        int firstDigit;
        int secondDigit;
        int lastDigit;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        number1 = number;
        lastDigit = number % 10;
        number = number / 10;
        secondDigit = number % 10;
        number = number / 10;
        firstDigit = number;
        sum = lastDigit + secondDigit + firstDigit;
        System.out.println(lastDigit);
        System.out.println(secondDigit);
        System.out.println(firstDigit);
        if(lastDigit > secondDigit) {
            System.out.println((double)(sum / number1));
        } else {
            System.out.println(number1);
        }
    }
}