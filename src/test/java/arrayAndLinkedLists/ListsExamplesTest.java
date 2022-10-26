package arrayAndLinkedLists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListsExamplesTest {

    @Test
    void arrayListAddEmpty() {
        ArrayList<String> list = new ArrayList<>();
        ListsExamples.listAdd(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void arrayListAddNotEmpty() {
        ArrayList<String> list = new ArrayList<>();
        ListsExamples.listAdd(list, "A", "A", "B");
        assertEquals(3, list.size());
    }

    @Test
    void arrayListRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListsExamples.listRemove(list, "a", "b", "c");
        assertTrue(list.isEmpty());
    }

    @Test
    void linkedListAddNotEmpty() {
        LinkedList<String> list = new LinkedList<>();
        ListsExamples.listAdd(list, "A", "A", "B");
        assertEquals(3, list.size());
    }

    @Test
    void linkedListAddEmpty() {
        LinkedList<String> list = new LinkedList<>();
        ListsExamples.listAdd(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void linkedListRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListsExamples.listRemove(list, "a", "b", "c");
        assertTrue(list.isEmpty());
    }

    @Test
    void linkedListOrdering() {
        List<String> list = new LinkedList<>();
        ListsExamples.listAdd(list, "a", "b", "c");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

}