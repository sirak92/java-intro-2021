import java.util.Scanner;

public class MinDigit{
	
	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		System.out.print("Give me a three digit number: ");

		int n = console.nextInt();

		int a = n / 100;
		int b = (n % 100) / 10;
		int c = n % 10;

		if(a < c && a < b){

			System.out.print("Min Digit = " + a);
		}

		else if(b < a && b < c){

			System.out.print("Min Digit = " + b);
		}

		else if (c < a && c < b){

			System.out.print("Min Digit = " +c);
		}
	}
}