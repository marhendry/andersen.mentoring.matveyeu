package arrayAndLinkedLists;

import java.util.LinkedList;
//implements List<E>, Deque<E>, Cloneable, java.io.Serializable
//

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");
        System.out.println("Содержимое: " + list);
        System.out.println("-------------------");

        System.out.println(list.getFirst()+" "+list.getLast());
        System.out.println("-------------------");

        list.remove("Z");
        list.remove(2);
        System.out.println(list.getFirst()+" "+list.getLast());
        System.out.println("-------------------");

        list.removeFirst();
        list.removeLast();
        System.out.println("Содержимое после удаления: " + list);

        String val = list.get(2);
        list.set(2, val + "+");
        System.out.println("Содержимое после изменения: " + list);
    }
}
