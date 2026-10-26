import java.util.ArrayList;
import java.util.Collections;

class Hello {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>(java.util.List.of(10,50, 20, 30, 40));
       
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
        
    }
}