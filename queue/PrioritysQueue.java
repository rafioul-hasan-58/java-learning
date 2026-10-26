package queue;
import java.util.PriorityQueue;;
public class PrioritysQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers=new PriorityQueue<>();
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(20);

        System.out.println(numbers.isEmpty());
    }
}
