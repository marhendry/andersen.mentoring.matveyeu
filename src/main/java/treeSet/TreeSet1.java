package treeSet;

import lombok.extern.slf4j.Slf4j;

import java.util.SortedSet;
import java.util.TreeSet;

@Slf4j
public class TreeSet1 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("Kyiv");
        set.add("Minsk");
        set.add("Vilnius");
        set.add("Riga");

        log.info("Set after add method" + set);

        SortedSet<String> subSet = set.subSet("Kyiv", "Vilnius");
        log.info("Set after subSet was implemented" + set);
    }
}
