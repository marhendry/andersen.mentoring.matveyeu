package singletone;

public class Singletone {
    public static Singletone st;

    //синхронизируем на случай, если будет использована многопоточность
    public static synchronized Singletone getInstance(){
        if (st==null){
            st = new Singletone();
        }
        return st;
    }

    private Singletone() {}
    public void print(){
        System.out.println(this);
    }
}
