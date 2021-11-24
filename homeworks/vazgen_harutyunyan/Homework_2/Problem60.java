import java.util.Scanner;
public class Problem60 {
    public static void main(String[] args) {
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
       
        
        import java.util.Scanner;
public class Problem600 {
    public static void main(String[] args) {
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
        
        if(firstDigit > secondDigit && firstDigit > lastDigit) {
            if(secondDigit > lastDigit) {
                System.out.println(firstDigit + " " + secondDigit + " " + lastDigit);

            } else {
                System.out.println(firstDigit + " " + lastDigit + " " + secondDigit);
            }
        } else if(secondDigit > firstDigit && secondDigit > lastDigit) {
            if(firstDigit > lastDigit) {
                System.out.println(secondDigit + " " + firstDigit + " " + lastDigit);
            } else {
                System.out.println(secondDigit + " " + lastDigit + " " + firstDigit);
            }
        } else if(lastDigit > firstDigit && lastDigit > secondDigit) {
            if(firstDigit > secondDigit) {
                System.out.println(lastDigit + " " + firstDigit + " " + secondDigit);
            } else {
                System.out.println(lastDigit + " " + secondDigit + " " + firstDigit);
            }
        }
    }
}
        
        
        
        
        /*if(firstDigit > secondDigit && firstDigit > lastDigit) {
            if(secondDigit > lastDigit) {
                System.out.println(firstDigit + " " + secondDigit + " " + lastDigit);

            } else {
                System.out.println(firstDigit + " " + lastDigit + " " + secondDigit);
            }
        } else if(secondDigit > firstDigit && secondDigit > lastDigit) {
            if(firstDigit > lastDigit) {
                System.out.println(secondDigit + " " + firstDigit + " " + lastDigit);
            } else {
                System.out.println(secondDigit + " " + lastDigit + " " + firstDigit);
            }
        } else if(lastDigit > firstDigit && lastDigit > secondDigit) {
            if(firstDigit > secondDigit) {
                System.out.println(lastDigit + " " + firstDigit + " " + secondDigit);
            } else {
                System.out.println(lastDigit + " " + secondDigit + " " + firstDigit);
            }
        }*/
    }
}
