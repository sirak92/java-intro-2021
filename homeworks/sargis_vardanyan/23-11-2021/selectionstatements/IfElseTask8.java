package selectionstatements;

import java.util.Scanner;

/*
  Assign 'a' to a character f and print, if
  sum of 3-digit number's ten's and hundred's is smaller then 5,
  otherwise assign 'b'.   
*/
public class IfElseTask8 {

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();

int number0 = number;
int a = number % 10;
number = number / 10;
int b = number % 10;
number = number / 10;
int c = number;
char f;

if(c + b < 5){
  f = 'a';
} else {
  f = 'b';
} 

System.out.println(f);

}

}
