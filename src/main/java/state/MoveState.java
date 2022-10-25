package state;

public class MoveState implements TransformerStateInterface{
    @Override
    public void action() {
        System.out.println("Move!");
    }
}
