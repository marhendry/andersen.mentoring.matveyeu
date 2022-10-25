package factory;

public class CarSelector {
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_TRACK:
                car = new Jeep();
                break;
            case GRASS:
                car = new NewJeep();
                break;
        }
        return car;
    }

}
