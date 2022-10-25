package decorator;

public class BorderDecorator extends Decorator{

public BorderDecorator(Component component){
    super(component);
}
    @Override
    public void afterDraw() {
        System.out.println("...added border");
    }
}
