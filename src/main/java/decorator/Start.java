package decorator;

public class Start {
    public static void main(String[] args) {
        Component window = new Window();
        window.draw();

        System.out.println("-------------------------");
//в данном случае мы используем уже декоратор и передаем ему новй объект new Window в парам.
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        System.out.println("-------------------------");
//в данном случае мы декоратор вкладываем в декоратор
        Component windowWithColor = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithColor.draw();

    }
}
