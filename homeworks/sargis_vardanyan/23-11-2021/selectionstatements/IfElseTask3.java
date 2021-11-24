package selectionstatements;

import java.util.Scanner;

/*
  Given a 3-digit number,
  compute and print the number's division by the sum of its digits, if
  the number is greatter then the given k,
  otherwise compute and print the pointers division by the number.
*/
public class IfElseTask3{

public static void main(String [] args){

System.out.println("Enter a number with 3 digit :");
Scanner scanner1 = new Scanner(System.in);
int number = scanner1.nextInt();
System.out.println("Give k a value :");
Scanner scanner2 = new Scanner(System.in);
int k = scanner2.nextInt();

boolean t = false;
double result;

if(number > k){
int number0 = number;
int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;
result = number0 / (a + b + c);
} else {
result = (number % 10) / number;
}

System.out.println(result);

}

}
