package map;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;

@Slf4j
public class HashMap1 {
    public static void main(String[] args) {


        Map<String, Double> hashMap = new java.util.HashMap<>();

        hashMap.put("Biden", 1234.34);
        hashMap.put("Obama", 2345.22);
        hashMap.put("Trump", 3456.00);

        Set<String> keys = hashMap.keySet();

        hashMap.remove("Trump", 3456.00);
        log.info("HashMap after manipulations" + hashMap);
    }
}
