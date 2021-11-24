package selectionstatements;

import java.util.Scanner;

/*
  Get digit with the highest value, from a given 3-digit number.
*/
public class IfElseTask4 {

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();


int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;
  
int max = a;
 
 if(max > b){
   max = b;
 } 
 if (max > c) {
   max = c;
 }

System.out.println("max = " + max);

}

}
