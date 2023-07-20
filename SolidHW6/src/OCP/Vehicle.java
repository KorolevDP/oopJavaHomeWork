package OCP;

/**
 * Родительский класс транспорт
 */
public abstract class Vehicle {
    private int  maxSpeed;
    private String type;

    /**
     * @param maxSpeed  максимальная скорость
     * @param type тип авто
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    /**
     * метод подсчета скорости
     */
    abstract double calculateAllowedSpeed();

}