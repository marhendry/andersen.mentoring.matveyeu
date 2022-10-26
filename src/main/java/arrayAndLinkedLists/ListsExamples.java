package arrayAndLinkedLists;

import java.util.Collections;
import java.util.List;

public class ListsExamples {
    public static void listAdd(List<String> list, String... element) {
        Collections.addAll(list, element);
    }

    public static void listRemove(List<String> list, String... element) {
        for (String s : element) {
            list.remove(s);
        }
    }
}
