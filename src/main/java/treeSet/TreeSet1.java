package treeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("Kyiv");
        set.add("Minsk");
        set.add("Vilnius");
        set.add("Riga");

        System.out.println(set);

        SortedSet<String> subSet = set.subSet("Kyiv", "Vilnius");
        System.out.println("SubSet: " + subSet);

        System.out.println("HeadSet: " + set.headSet("Vilnius"));
        System.out.println("TailSet: " + set.tailSet("Riga"));
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());
    }
}
