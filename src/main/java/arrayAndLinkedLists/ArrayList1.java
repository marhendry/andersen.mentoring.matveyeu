package arrayAndLinkedLists;

import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();

        System.out.println("Initial list size: " + list.size());

        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add("F");
        System.out.println("Array size after some changes_1: " + list.size());
        list.add(1, "A2");
        System.out.println(list);
        list.set(0, "C2");
        System.out.println("Array after some changes_2: " + list);

        System.out.println(list.get(0));

        list.forEach(p -> System.out.print(p.toCharArray()));
    }
}
