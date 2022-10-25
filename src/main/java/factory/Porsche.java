package factory;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed is 180 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped in 8 sec");
    }
}
