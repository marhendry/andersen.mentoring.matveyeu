package map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class MapExamplesTest {
    class MapsExamplesTest {
        final String name1 = "Sasha";
        final String name2 = "Andrew";
        final String name3 = "Brad";

        final String city1 = "Berlin";
        final String city2 = "Paris";
        final String city3 = "Tokio";
        final String city4 = "Rome";
        final String city5 = "Warsaw";

        @Test
        void hashMapTest() {

            Map<String, String> map = new HashMap<>();
            map.put(name1, city1);
            map.put(name2, city2);
            map.put(name3, city3);
            map.put(null, city4);
            map.put(null, city5);

            assertEquals(4, map.size());
            assertEquals(city5, map.get(null));

            map.remove(name1);

            assertFalse(map.containsKey(name1));
            assertEquals(3, map.size());
            assertNull(map.get(name1));
        }

        @Test
        void treeMapTest() {
            Map<String, String> map = new TreeMap<>();
            map.put(name1, city1);
            map.put(name2, city2);
            map.put(name3, city3);

            assertThrows(NullPointerException.class, () -> map.put(null, city1));

            assertEquals(3, map.size());

            map.remove(name1);

            assertFalse(map.containsKey(name1));
            assertEquals(2, map.size());
            assertNull(map.get(name1));

        }

        @Test
        void linkedHashMapTest() {
            Map<String, String> map = new LinkedHashMap<>();
            map.put(name1, city1);
            map.put(name2, city2);
            map.put(name3, city3);
            map.put(null, city4);
            map.put(null, city5);

            assertEquals(4, map.size());
            assertEquals(city5, map.get(null));

            map.remove(name1);

            assertFalse(map.containsKey(name1));
            assertEquals(3, map.size());
            assertNull(map.get(name1));
        }

    }

}