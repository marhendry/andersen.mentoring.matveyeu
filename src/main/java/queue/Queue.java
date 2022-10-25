package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new LinkedList<>();
        queue.offer("Kyiv");
        queue.offer("Minsk");
        queue.offer("Vilnius");
        queue.offer("Riga");

        System.out.println(queue);
        System.out.println("------------------");
        System.out.println(queue.peek());
        System.out.println("------------------");
        System.out.println(queue);

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
        System.out.println(queue);
    }
}
