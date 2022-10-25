package factory;

public class CarSelector {
    //интересный момент: CarSelector используется в единственном экземпляре - т.е. можно использовать singletone
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
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
