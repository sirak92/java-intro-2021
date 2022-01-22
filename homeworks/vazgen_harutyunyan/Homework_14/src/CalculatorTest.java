import Calc.Calculator;
import CalcExceptions.CalculatorException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String str1;
        String str2;
        System.out.println("Enter first number");
        str1=scanner.nextLine();
        System.out.println("Enter second number");
        str2=scanner.nextLine();

        try{
           System.out.println(divide(str1,str2));
        } catch(NumberFormatException ex){
            System.out.println("There are letter in string");
        } catch (ArithmeticException e) {
            System.out.println("Divide  by 0");
        }


    }
    public static double divide(String s1,String s2) throws Exception {
        int number1;
        int number2;
        double result;
            number1=Integer.parseInt(s1);
            number2=Integer.parseInt(s2);
            result=number1/number2;
            return result;
    }
}
