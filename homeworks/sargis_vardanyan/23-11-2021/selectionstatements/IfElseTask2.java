package selectionstatements; 

import java.util.Scanner;

/*
   Given 3-digit number,
   assign true to boolean t if there is any matching in numbers digits,
   otherwise assign false. 
*/
public class IfElseTask2{
public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
if(number < 100 || number > 999){
System.out.println("Wrong number input");
} else {

boolean t = false;
int a = number % 10;
number = number / 10;
int b = number % 10; 
number = number % 10;
int c = number;

if(a == b || a == c || b == c){
t = true;
}

System.out.println(t);

}

}

} 
