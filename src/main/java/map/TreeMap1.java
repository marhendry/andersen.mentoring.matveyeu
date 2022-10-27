package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        SortedMap<String, Double> treeMap = new TreeMap<>();

        treeMap.put("Mike", 3434.34);
        treeMap.put("Pete", 123.22);
        treeMap.put("Clark", 1378.00);

        treeMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
