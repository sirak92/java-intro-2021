import  java.util.Scanner;

public class TrueOrFalse {

     static boolean IsMultipleOf3(int a) {

         return a > 1 && a < 100 && (a % 3) == 0;
     }

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        System.out.print("Number = ");
        
        int a = console.nextInt();

        if (IsMultipleOf3(a))
            
            System.out.println("True");
        
        else
            
            System.out.println("False");
    }
}
