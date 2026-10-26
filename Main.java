import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.set(0, 50);
        numbers.add(40);
        numbers.clear();

        System.out.println(numbers);
    }
}
