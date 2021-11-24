package selectionstatements;

import java.util.Scanner;

/*
    Sort the 3-digit number's digits from greatest to smallest.
*/
public class IfElseTask10{

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();

int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;

  if(a >= b){
    if(b >= c){
      System.out.println(a + " " + b + " " + c);
    } else if(a >= c){
          System.out.println(a + " " + c + " " + b);
    } else {
         System.out.println(c + " " + a + " " + b);
    }
  } else if(c >= b){
        System.out.println(c + " " + b + " " + a); 
  } else if(c >= a){
        System.out.println(b + " " + c + " " + a);
  } else{
        System.out.println(b + " " + a + " " + c);
  }


}

}
