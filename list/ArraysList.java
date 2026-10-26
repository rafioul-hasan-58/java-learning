package list;

import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.set(0, 50);
        numbers.add(40);

        for (int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        // System.out.println(numbers.isEmpty());
    }
}
