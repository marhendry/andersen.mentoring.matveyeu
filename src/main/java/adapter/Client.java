package adapter;

import java.util.ArrayList;
import java.util.List;

//клиент, желающий распечатывать сразу много текста, РАБОТАЕТ С АДАПТЕРОМ, А НЕ С ПРИНТЕРОМ НАПРЯМУЮ
public class Client {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("List1");
        list.add("List2");
        list.add("List3");
        list.add("List4");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
