import java.util.Scanner;
public class Problem55 {
    public static void main(String[] args) {
        int number;
        int min = 9;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();

        if (min > number % 10) {
            min = number % 10;
        }
        number = number / 10;
        if  (min > number % 10) {
            min = number % 10;
        }
        number = number / 10;
        if  (min > number) {
            min = number;
        }
        System.out.print(min);
    }
}