package selectionstatements;

import java.util.Scanner;

/*
  Compute and print 3-digit number's ten's division by pointer, if
  the number is greater then 300,
  otherwise hundred's division by pointer  
*/
public class IfElseTask7 {

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();

if((number % 10) == 0){
  System.out.print(number + "has 0 pointer");
} else {

int number0 = number;
int a = number % 10;
number = number / 10;
int b = number % 10;
number = number / 10;
int c = number;

 if(number0 > 300){
   System.out.println(b / a);
 } else {
   System.out.println(c / a);
 }

}

}


}
