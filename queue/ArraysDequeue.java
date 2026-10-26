package queue;
import java.util.ArrayDeque;
public class ArraysDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers=new ArrayDeque<>();

        numbers.push(20);
        numbers.push(10);
        numbers.pop();
        System.out.println(numbers);
    }
}
