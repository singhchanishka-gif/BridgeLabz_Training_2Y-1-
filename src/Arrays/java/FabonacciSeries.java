package Arrays.java;
public class FabonacciSeries {

    void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        FabonacciSeries obj = new FabonacciSeries();

        int n = 10; // Number of terms
        obj.fibonacci(n);
    }
}

