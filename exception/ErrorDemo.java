package exception;

public class ErrorDemo {
    public static void recursiveMethod() {
        recursiveMethod();
    }


    public static void main(String[] args) {
        System.out.println("Starting program...");
        recursiveMethod();

        System.out.println("This line will never be reached!");
    }
}
