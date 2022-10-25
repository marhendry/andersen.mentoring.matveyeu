package factory;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed is 120km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped in 5 sec");
    }
}
