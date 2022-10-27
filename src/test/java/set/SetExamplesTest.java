package set;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetExamplesTest {

    final String city1 = "Berlin";
    final String city2 = "Paris";
    final String city3 = "Tokio";
    final String city4 = "Rome";
    final String city5 = "Warsaw";

    @Test
    void hashSetTest() {
        final HashSet<String> set = new HashSet<>();

        set.add(city1);
        set.add(city2);
        set.add(city3);
        set.add(city4);
        set.add(city5);
        assertEquals(5, set.size());

        set.add(city1);
        set.add(city3);
        assertEquals(5, set.size());

        set.remove(city1);
        assertEquals(4, set.size());

        set.add(null);
        assertEquals(5, set.size());
    }

    @Test
    void treeSetTest() {

        final TreeSet<String> set = new TreeSet<>();

        set.add(city1);
        set.add(city2);
        set.add(city3);
        set.add(city4);
        set.add(city5);
        assertEquals(5, set.size());

        set.add(city1);
        set.add(city3);
        assertEquals(5, set.size());

        set.remove(city1);
        assertEquals(4, set.size());

        assertThrows(NullPointerException.class, () -> set.add(null));

    }

    @Test
    void linkedHashSetTest() {
        final HashSet<String> set = new HashSet<>();

        set.add(city1);
        set.add(city2);
        set.add(city3);
        set.add(city4);
        set.add(city5);
        assertEquals(5, set.size());

        set.add(city1);
        set.add(city3);
        assertEquals(5, set.size());

        set.remove(city1);
        assertEquals(4, set.size());

        set.add(null);
        assertEquals(5, set.size());
    }
}