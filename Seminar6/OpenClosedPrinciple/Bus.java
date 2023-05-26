/**
 * Класс, представляющий автобус.
 */
public class Bus extends Vehicle {
    /**
     * Конструктор класса Bus.
     * @param maxSpeed Максимальная скорость автобуса.
     * @param type Тип автобуса.
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    /**
     * Расчет допустимой скорости для автобуса.
     * @return Допустимая скорость автобуса.
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}