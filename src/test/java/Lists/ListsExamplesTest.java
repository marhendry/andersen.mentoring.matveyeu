package Lists;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListsExamplesTest {

    @Test
    void arrayListAddingEmptyListTest() {
        ArrayList<String> list = new ArrayList<>();
        ListsExamples.listAdd(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void arrayListAddingValuesTest() {
        ArrayList<String> list = new ArrayList<>();
        ListsExamples.listAdd(list, "A", "A", "B");
        assertEquals(3, list.size());
    }

    @Test
    void arrayListRemoveTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListsExamples.listRemove(list, "a", "b", "c");
        assertTrue(list.isEmpty());
    }

    @Test
    void linkedListAddingValuesTest() {
        LinkedList<String> list = new LinkedList<>();
        ListsExamples.listAdd(list, "A", "A", "B");
        assertEquals(3, list.size());
    }

    @Test
    void linkedListAddingEmptyListTest() {
        LinkedList<String> list = new LinkedList<>();
        ListsExamples.listAdd(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void linkedListRemoveTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListsExamples.listRemove(list, "a", "b", "c");
        assertTrue(list.isEmpty());
    }

    @Test
    void linkedListGetMethodTest() {
        List<String> list = new LinkedList<>();
        ListsExamples.listAdd(list, "a", "b", "c");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }
}