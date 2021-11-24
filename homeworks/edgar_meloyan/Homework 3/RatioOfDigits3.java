import java.util.Scanner;

//Task 57, homework 3;

public class RatioOfDigits3{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		System.out.print("Give me a three digit number: ");

		int n = console.nextInt();

		int a = n / 100;
		int b = (n % 100) / 10;
		int c = n % 10;

		if(b == 0 || c == 0){

			System.out.print(n + " Has a 0 digit");
		}
		else {

		double val1 = ((double) b / c);
		double val2 = ((double) a / c);

		if(n > 300){

			System.out.print(val1);
		}

		else{

			System.out.print(val2);
		}
		}
	}
}