package selectionstatements;

import java.util.Scanner;

/* 
   Given 3-digit number, 
   assign true to boolean t if the point of number equals the sum of hundreds and tens, 
   otherwise assign false.
*/
public class IfElseTask1{

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");

Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
if(number < 100 || number > 999){
System.out.println("Wrong number input");
} else {

boolean t = false;
//int c = number/100;
//int b = (number - a*100)/10;
//int a = number - (a*100) - (b*10);
int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;

if(a == c + b){
t = true;
}

System.out.println(t);

}

}

}
