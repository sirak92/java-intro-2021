import java.util.Scanner;

public class Digits {

//Task 58, Homework 3;

    public static void main (String [] args ){
        System.out.print("Give me a three digit number: ");
        Scanner console = new Scanner(System.in);
        
        char f = 'a';
        int n = console.nextInt();
        int a = n / 100;
        int b = (n % 100)/10;

        if (a + b < 5){
           
            System.out.println(f);
        } 
        else {
            
            System.out.println(f = 'b');
        } 

    }

}
