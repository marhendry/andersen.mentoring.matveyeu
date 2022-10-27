package map;

import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {


        Map<String, Double> hashMap = new java.util.HashMap<>();

        hashMap.put("Biden", 1234.34);
        hashMap.put("Obama", 2345.22);
        hashMap.put("Trump", 3456.00);

        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }
        System.out.println("-------------------------");

        hashMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(hashMap);
        hashMap.remove("Trump", 3456.00);
        System.out.println("-------------------------");
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("Obama"));
        System.out.println(hashMap.containsValue(1234.34));



    }
}
