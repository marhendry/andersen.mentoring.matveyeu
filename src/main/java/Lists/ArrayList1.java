package Lists;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();

        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add("F");

        log.info("Array size after some changes_1: " + list.size());
        list.add(1, "A2");
        System.out.println(list);
        list.set(0, "C2");
        log.info("Array after some changes_2: " + list);

        list.forEach(p -> System.out.print(p.toCharArray()));
    }
}
