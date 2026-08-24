package Arrays.java;

public class Calculator {

        int add(int a, int b) {
            return a + b;
        }


        int sub(int a, int b) {
            return a - b;
        }


        int mul(int a, int b) {
            return a * b;
        }

        int div(int a, int b) {
            return a / b;
        }

        public static void main(String[] args) {

            Calculator obj = new Calculator();

            int a = 20;
            int b = 10;

            System.out.println("Addition = " + obj.add(a, b));
            System.out.println("Subtraction = " + obj.sub(a, b));
            System.out.println("Multiplication = " + obj.mul(a, b));
            System.out.println("Division = " + obj.div(a, b));
        }
    }

