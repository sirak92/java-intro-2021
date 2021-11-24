import java.util.Scanner; 

//Task 55, homework 3

public class RatioOfDigits2{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		System.out.print("Give me a three digit number: ");

		double n = console.nextDouble();
		
		double a = n / 100;
		double b = (n % 100) / 10;
		double c = n % 10;

		double val1 = (a + b + c) / n;

		if(a > b){

			System.out.print("Result of ratio = " + val1);
		}

		else{

			System.out.print(n);
		}
	}
}