import java.util.Scanner;

//Task 53, Homework 3;
 
public class RatioOfDigits{

	public static void main(String[] args){

		Scanner console = new Scanner(System.in);

		System.out.print("Give me a three digit number: ");
		
		int n = console.nextInt();
		
		System.out.print("Print the number for comparison: ");
		
		int k = console.nextInt();

		int a = n / 100;
		int b = (n % 100) / 10;
		int c = n % 10;

		int val1 = n / (a + b + c); //Number / Sum of digits
		int val2 = c / n; //units rank / number

		if (val1 > k){

			System.out.print(val1);
		}

		else {

			System.out.print(val2);
		}

	}

}