package exception;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Unchecked Exception Demo ---");

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an Unchecked Exception: Cannot divide by zero!");
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught an Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues running smoothly!");
    }
}
