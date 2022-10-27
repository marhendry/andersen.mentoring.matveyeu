package queue;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
@Slf4j
public class Queue1 {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new LinkedList<>();
        queue.offer("Kyiv");
        queue.offer("Minsk");
        queue.offer("Vilnius");
        queue.offer("Riga");

        log.info("Queue after manipulations" + queue);
        
        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
        log.info("Queue after polling" + queue);
    }
}
