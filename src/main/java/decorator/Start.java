package decorator;

public class Start {
    public static void main(String[] args) {
        Component window = new Window();
        window.draw();

        System.out.println("-------------------------");

        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        System.out.println("-------------------------");

        Component windowWithColor = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithColor.draw();

    }
}
