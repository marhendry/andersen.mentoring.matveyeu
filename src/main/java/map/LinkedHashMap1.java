package map;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashMap;

@Slf4j
public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>(16, 0.75f);

        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);

        log.info("LinkedHashMap after manipulations" + wordNumberMapping);
        wordNumberMapping.putIfAbsent("five", 5);

    }
}
