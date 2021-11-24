package selectionstatements;

import java.util.Scanner;

/*
  Compute and print 3-digit number's sum of digits division by the number, if
  the pointer is greater then ten's ,
  otherwise print the number.
*/
public class IfElseTask6 {

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int number0 = number;

int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;
double d = (a + b +c) / number0;

if(a > b){
  System.out.println(d);
} else {
  System.out.println(number0);
}

}

}
