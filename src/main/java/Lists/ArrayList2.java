package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> arrayListFirst = new ArrayList<>();
        List<String> arrayListSecond = List.of("1", "2");
        System.out.println(arrayListSecond);

        arrayListFirst.add("A");
        arrayListFirst.add("B");
        arrayListFirst.add("C");
        arrayListFirst.add("D");
        arrayListFirst.add("E");
        arrayListFirst.add("F");
        System.out.println("arrayListFirst before changes " + arrayListFirst);
        arrayListFirst.remove(5);
        arrayListFirst.addAll(3, arrayListSecond);
        System.out.println("arrayListFirst after some changes " + arrayListFirst);

        arrayListFirst.clear();
        System.out.println("arrayListFirst after clearing " + arrayListFirst);
    }
}
