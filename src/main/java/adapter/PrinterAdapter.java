package adapter;

import java.util.List;

//адаптер, к-й совмещает ЖЕЛАНИЕ клиента и ВОЗМОЖНОСТИ принтера
public class PrinterAdapter implements PageListPrinter{

    // тут при помощи композиции создаем экземпляр объекта принтер
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
