package map;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>(16, 0.75f);

        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);
        System.out.println(wordNumberMapping);
        System.out.println("-------------------------");
        System.out.println(wordNumberMapping.get("one"));
        wordNumberMapping.putIfAbsent("five", 5);
        System.out.println(wordNumberMapping);
        System.out.println("-------------------------");
    }
}
