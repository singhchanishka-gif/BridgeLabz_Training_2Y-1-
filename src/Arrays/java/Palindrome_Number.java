package Arrays.java;

public class Palindrome_Number {

    boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Palindrome_Number obj = new Palindrome_Number();

        int num = 121;

        if (obj.isPalindrome(num)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}


