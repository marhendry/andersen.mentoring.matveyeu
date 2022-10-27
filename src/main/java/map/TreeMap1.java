package map;

import lombok.extern.slf4j.Slf4j;

import java.util.SortedMap;
import java.util.TreeMap;
@Slf4j
public class TreeMap1 {
    public static void main(String[] args) {
        SortedMap<String, Double> treeMap = new TreeMap<>();

        treeMap.put("Mike", 3434.34);
        treeMap.put("Pete", 123.22);
        treeMap.put("Clark", 1378.00);

        log.info("TreeMap after manipulations" + treeMap);
    }
}
