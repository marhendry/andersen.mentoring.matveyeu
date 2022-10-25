package singletone;

public class Singletone {
    public static Singletone singletone;

    public static synchronized Singletone getInstance() {
        if (singletone == null) {
            singletone = new Singletone();
        }
        return singletone;
    }

    private Singletone() {
    }

    public void print() {
        System.out.println(this);
    }
}
