import java.util.Scanner;

public class StringExeptions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input firts Sttring");
        String firtSrting = scanner.nextLine();
        System.out.println("Input second Sttring");
        String sencondString = scanner.nextLine();
        checkExeptions(firtSrting, sencondString);
        printDevision(firtSrting, sencondString);


    }

    static void checkExeptions(String firstString, String secondString) {
        try {
            double firstString1 = Double.parseDouble(firstString);
            double firstString2 = Double.parseDouble(firstString);
        } catch (Exception exception) {
            System.out.println("Strings can not be parsed to numbers");
            System.exit(-1);
        }
    }

    static void printDevision(String firstString, String secondString) {
        System.out.println(
                Double.parseDouble(firstString) /
                        Double.parseDouble(secondString)
        );
    }
}