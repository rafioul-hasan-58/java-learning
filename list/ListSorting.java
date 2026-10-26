package list;

import java.util.*;

public class ListSorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                List.of("Christopher", "Avaa", "Noah", "Mia"));

        names.sort(Comparator.comparingInt(String::length));

        System.out.println(names);
    }
}
