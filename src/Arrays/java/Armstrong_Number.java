package Arrays.java;
public class Armstrong_Number {
    int count(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int d = count(n);

        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, d);
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Armstrong_Number obj = new Armstrong_Number();

        int num = 153;

        if (obj.isArmstrong(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}