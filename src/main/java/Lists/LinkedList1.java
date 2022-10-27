package Lists;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

@Slf4j
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
        log.info("LinkedList contains the following after changes: " + list);

        list.remove("Z");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        log.info("LinkedList after remove elements: " + list);

        String val = list.get(2);
        list.set(2, val + "+");
        log.info("LinkedList after minor changes: " + list);
    }
}
