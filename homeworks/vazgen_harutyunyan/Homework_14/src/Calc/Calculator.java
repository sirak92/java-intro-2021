package Calc;

public class Calculator {
    private String str1;
    private String str2;



    public Calculator(){
    }

    public Calculator(String str1,String str2){
        this.str1=str1;
        this.str2=str2;
    }

    public void setNumber1(String str1){
        this.str1=str1;
    }
    public void setNumber2(String str2){
        this.str2=str2;
    }
    public String getNumber1(){
        return str1;
    }
    public String getNumber2(){
        return str2;
    }

    public int parseInt(String s){
        int number =Integer.parseInt(s);
        return number;
    }


    public int sum(int number1, int number2){
        return number1+number2;
    }

    public double divide(int number1,int number2){
        return ((double)(number1)/number2);
    }


}
