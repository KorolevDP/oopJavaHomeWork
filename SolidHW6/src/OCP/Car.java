package OCP;

/**
 * Класс автомобиль унаследованный от транспорт
 */
public class Car extends Vehicle {

    public Car (int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
     double calculateAllowedSpeed(){
        return getMaxSpeed() * 0.8;
    }
}
