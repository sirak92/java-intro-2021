import java.util.Scanner;

public class DigitsTrue{

//Task 51, Homework 3;

public static void main(String[] args){
	
	boolean t = true;

	System.out.print("Give me a three digit number: ");

	Scanner console = new Scanner(System.in);
	
	int n = console.nextInt();
	
	int a = n / 100;
	int b = (n % 100) / 10;
	int c = n % 10;

	if (c == (a + b)){

		System.out.print(t);

	} else {

		System.out.print(t = false);
	}
}
}