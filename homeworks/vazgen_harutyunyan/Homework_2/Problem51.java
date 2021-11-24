import java.util.Scanner;
public class Problem51 {
    public static void main(String[] args) {
        boolean x = true;
        int number;
        int lastDigit;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        lastDigit = number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        if(sum == lastDigit) {
            System.out.println(x);
        } else {
            System.out.println(!x);
        }

    }
}