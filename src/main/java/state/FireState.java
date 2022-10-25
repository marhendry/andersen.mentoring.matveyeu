package state;

public class FireState implements TransformerStateInterface {
    @Override
    public void action() {
        System.out.println("Fire!");
    }
}
