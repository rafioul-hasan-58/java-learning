package list;

import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(40);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(numbers.size()-1));

        System.out.println(numbers);
    }
}
