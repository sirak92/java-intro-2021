import java.util.Scanner;
public class Problem54 {
    public static void main(String[] args) {
        int number;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        if (max < number % 10) {
            max = number % 10;
        }
        number = number / 10;
        if  (max < number % 10) {
            max = number % 10;
        }
        number = number / 10;
        if  (max < number) {
            max = number;
        }
        System.out.print(max);
    }
}
