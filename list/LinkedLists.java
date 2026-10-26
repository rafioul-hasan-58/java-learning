package list;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(10);
        numbers.addLast(40);
        numbers.removeFirst();
        numbers.removeLast();

        System.out.println(numbers);
    }
}
