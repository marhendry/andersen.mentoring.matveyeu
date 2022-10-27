package queue;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueExamplesTest {

    final String city1 = "Berlin";
    final String city2 = "Paris";
    final String city3 = "Tokio";
    final String city4 = "Rome";
    final String city5 = "Warsaw";

    @Test
    void queueTest() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Kyiv");
        queue.offer("Minsk");
        queue.offer("Vilnius");
        queue.offer("Riga");

        assertEquals(4, queue.size());

        queue.add(city1);
        queue.add(city3);
        assertEquals(6, queue.size());

        queue.remove(city1);
        assertEquals(5, queue.size());

        queue.add(null);
        assertEquals(6, queue.size());
    }


}