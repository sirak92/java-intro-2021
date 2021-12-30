class MathClass {

    static double min(double... array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    static double max(double... array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    static int signum(double number) {
        if (number == 0) {
            return 0;
        } else if (number > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    static double rank(int number, int rank) {
        int s = 1;
        for (int i = 1; i <= rank; i++) {
            s *= number;
        }
        return s;
    }

    static int factorial(int number){
        int fact=1;
        for (int i = 1; i <= number; i++) {
            fact*=i;
        }
        return fact;
    }

    static double toRadians(double number){
        return number/57.296;
    }
}

public class Mathf {
    MathClass obj = new MathClass();

    public static void main(String[] args) {
        System.out.println(MathClass.min(2, 5, 5.1, -12));
        System.out.println(MathClass.max(2, 5, 5.1, -12));
        System.out.println(MathClass.signum(3));
        System.out.println(MathClass.rank(2,4));
        System.out.println(MathClass.factorial(4));
        System.out.println(MathClass.toRadians(15));

    }
}