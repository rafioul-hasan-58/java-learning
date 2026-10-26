package set;
import java.util.HashSet;
public class HashedSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();

        numbers.add(30);
        numbers.add(20);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);
    }
}
