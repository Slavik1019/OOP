/**
 * Класс, представляющий автомобиль.
 */
public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    /**
     * Расчет допустимой скорости для автомобиля.
     *
     * @return Допустимая скорость автомобиля.
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}