package state;

public class TransformerContext implements TransformerStateInterface{
    private TransformerStateInterface state;

    public TransformerStateInterface getState() {
        return state;
    }

    public void setState(TransformerStateInterface state) {
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();
    }
}
