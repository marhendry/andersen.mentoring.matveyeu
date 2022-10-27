package Lists;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> arrayListFirst = new ArrayList<>();
        List<String> arrayListSecond = List.of("1", "2");

        arrayListFirst.add("A");
        arrayListFirst.add("B");
        arrayListFirst.add("C");
        arrayListFirst.add("D");
        arrayListFirst.add("E");
        arrayListFirst.add("F");

        arrayListFirst.remove(5);
        arrayListFirst.addAll(3, arrayListSecond);

        arrayListFirst.clear();
        log.info("arrayListFirst after clearing " + arrayListFirst);
    }
}
