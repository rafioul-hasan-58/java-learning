package list;

import java.util.ArrayList;
import java.util.Collections;
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mito");
        names.add("Sourob");
        names.add("Heigenburg");

       names.sort(Collections.reverseOrder());
       System.out.println(names);

    }
}
