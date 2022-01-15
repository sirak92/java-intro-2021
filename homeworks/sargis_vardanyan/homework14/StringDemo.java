package homework14;

public class StringDemo {

    public boolean function(String s, StringOperation op) {
        return op.test(s);
    }
}

@FunctionalInterface
interface StringOperation {
    boolean test(String s);
}

class Tester {
    public static void main(String[] args) {
        String str1 = "Word";
        String str2 = "WWW";
        StringDemo obj = new StringDemo();

        StringOperation isPalindrome = s -> {
            int i = 0, j = s.length() - 1;

            while (i < j) {
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                    continue;
                }
                return false;
            }
            return true;
        };

        StringOperation allSameChars = s -> {
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(0) == s.charAt(i)) {
                    i++;
                    continue;
                }
                return false;
            }
            return true;
        };

        StringOperation allUpperCase = s -> {
            for (int i = 0; i < s.length(); i++) {
                if ((int)s.charAt(i) + 32 < 97 || (int)s.charAt(i) + 32 > 122) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(str1 + " is palindrome: " + obj.function(str1, isPalindrome));
        System.out.println(str2 + " is palindrome: " + obj.function(str2, isPalindrome));
        System.out.println(str1 + "'s elements are the same: " + obj.function(str1, allSameChars));
        System.out.println(str2 + "'s elements are the same: " + obj.function(str2, allSameChars));
        System.out.println(str1 + "'s elements are uppercase: " + obj.function(str1, allUpperCase));
        System.out.println(str2 + "'s elements are uppercase: " + obj.function(str2,allUpperCase));

    }

}





