package exception;

public class PracticeException {
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // 'throw' is used INSIDE the method to TRIGGER the exception
            throw new ArithmeticException("HI u are not adult!");
        } else {
            System.out.println("Access granted: Welcome!");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(15);;
        }catch(ArithmeticException e){
            System.out.println(e.getClass());
        }
    }
}
