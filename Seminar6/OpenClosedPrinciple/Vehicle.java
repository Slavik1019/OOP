/**
 * Абстрактный класс, представляющий транспортное средство.
 */
public abstract class Vehicle {
    protected int maxSpeed; // Максимальная скорость
    protected String type; // Тип транспортного средства

    /**
     * Конструктор класса Vehicle.
     * @param maxSpeed Максимальная скорость.
     * @param type Тип транспортного средства.
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Получение максимальной скорости.
     * @return Максимальная скорость.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Получение типа транспортного средства.
     * @return Тип транспортного средства.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Абстрактный метод для расчета допустимой скорости транспортного средства.
     * @return Допустимая скорость.
     */
    public abstract double calculateAllowedSpeed();
}