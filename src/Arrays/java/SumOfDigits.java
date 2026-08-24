package Arrays.java;

public class SumOfDigits {

    int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        SumOfDigits obj = new SumOfDigits();

        int num = 12345;

        System.out.println("Sum of Digits = " + obj.sumOfDigits(num));
    }
}
