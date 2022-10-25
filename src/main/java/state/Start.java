package state;

public class Start {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerStateInterface stateFire = new FireState();
        TransformerStateInterface stateMove = new MoveState();

        context.setState(stateFire);
        context.action();

        System.out.println("-------------------------");

        context.setState(stateMove);
        context.action();

    }
}
