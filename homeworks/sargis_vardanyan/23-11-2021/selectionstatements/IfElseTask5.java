package selectionstatements;

import java.util.Scanner;

/*
   Get digit with the lowest value, from a given 3-digit number.
*/
public class IfElseTask5 {

public static void main(String [] args){

System.out.println("Enter a number with 3 digit");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();


int a = number % 10;
number = number / 10;
int b = number % 10;
number = number /10;
int c = number;
int min = a;


if(min > b){
  min = b;
} 
if(min > c) {
   min = c;
}


System.out.println("min = " + min);

}

}
