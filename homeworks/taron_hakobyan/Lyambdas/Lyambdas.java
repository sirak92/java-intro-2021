
import java.util.Locale;
import java.util.Scanner;

public class Lyambdas {

    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();
        StringOperation stringOperation = (line1) -> {
            int steps = 0;
            for (int i = 0; i < line.length() - 1; i++) {
                if (line.charAt(i) == line.charAt(i + 1)) {
                    steps++;
                }
            }
            if (steps == line.length() - 1) {
                return true;
            }
            return false;
        };
        //System.out.println(func(line, stringOperation));
        StringOperation stringOperation2 = (line2) -> {
            if (line2.length() == 1) {
                return true;
            }
            if (line2.length() == 2) {
                if (line2.charAt(0) == line2.charAt(1)) {
                    return true;
                } else {
                    return false;
                }
            }
            for (int i = 0, popoxutyun = line2.length() - 1, steps = 0; i < line2.length() - 2; i++, popoxutyun -= 2) {
                if (line2.charAt(i) != line2.charAt(i + popoxutyun)) {
                    return false;
                }
            }
            return true;
        };
        //System.out.println(func(line,stringOperation2));
        StringOperation stringOperation3 = (line3) -> {
            String[] strings = new String[line3.length()];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = String.valueOf(line3.charAt(i));
                if (strings[i] != strings[i].toUpperCase()) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(func(line, stringOperation3));
    }


    static boolean func(String s, StringOperation operation) {
        return operation.test(s);
    }

    interface StringOperation {
        boolean test(String line);
    }

}