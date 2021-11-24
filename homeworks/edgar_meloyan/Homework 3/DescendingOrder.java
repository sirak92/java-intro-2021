import java.util.Scanner;

public class DescendingOrder{

//Task 60, Homework 4;

public static void main(String[] args){
	

	System.out.print("Give me a three digit number: ");

	Scanner console = new Scanner(System.in);
	
	int n = console.nextInt();
	
	int a = n / 100;
	int b = (n % 100) / 10;
	int c = n % 10;

	if (a <= b && b <= c){

		System.out.print(c + " " + b + " " + a);
	}
	
	else if (a <= c && c <= b){

		System.out.print(b + " " + c + " " + a);
	}

	else if (b <= a && a <= c){

		System.out.print(c + " " + a + " " + b);
	}

	else if (b <= c && c <= a){

		System.out.print(a + " " + c + " " + b);
	}

	else if (c <= b && b <= a){

		System.out.print(a + " " + b + " " + c);
	}

	else if (c <= a && a <= b){

		System.out.print(b + " " + a + " " + c);
	}

	}
}