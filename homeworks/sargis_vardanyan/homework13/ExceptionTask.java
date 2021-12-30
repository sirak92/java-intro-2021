package homework13;

import java.util.Scanner;

public class ExceptionTask {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String st1 = scan.nextLine();
        String st2 = scan.nextLine();
        scan.close();

        try {
            System.out.println(divide(st1, st2));
        } catch (NumberFormatException e) {
            System.out.println("Input is not an integer: ");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0: ");
        }
    }

    public static double divide(String st1, String st2) throws Exception {
        return Integer.parseInt(st1) / Integer.parseInt(st2);
    }

}
