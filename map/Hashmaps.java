package map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> marks = new LinkedHashMap<>();
        marks.put(33, "Sourob");
        marks.put(100, "Mito");
        marks.put(29, "Science");
        marks.put(30, "Science");
        System.out.println(marks);

    }
}
