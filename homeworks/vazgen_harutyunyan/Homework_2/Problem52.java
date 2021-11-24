import java.util.Scanner;
public class Problem52 {
    public static void main(String[] args) {
        boolean x = true;
        int number;
        int firstDigit;
        int secondDigit;
        int lastDigit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        lastDigit = number % 10;
        number = number / 10;
        secondDigit = number % 10;
        number = number / 10;
        firstDigit = number;
        if(lastDigit == secondDigit || lastDigit == firstDigit || secondDigit == firstDigit) {
            System.out.println(x);
        } else {
            System.out.println(!x);
        }
    }
}