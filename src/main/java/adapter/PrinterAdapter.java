package adapter;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {

    // тут при помощи композиции создаем экземпляр объекта принтер
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
