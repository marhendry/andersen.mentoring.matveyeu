package singletone;

public class Start {
    public static void main(String[] args) {
        Singletone.getInstance().print();
        Singletone.getInstance().print();
        Singletone.getInstance().print();
    }
}
