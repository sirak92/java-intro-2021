import java.util.Scanner;
public class Problem58 {
    public static void main(String[] args) {
        char f;
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
        if((firstDigit + secondDigit) > 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);
    }
}