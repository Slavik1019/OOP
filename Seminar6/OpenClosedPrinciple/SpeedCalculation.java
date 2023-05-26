/**
 * Класс для расчета допустимой скорости.
 */
public class SpeedCalculation {
    /**
     * Расчет допустимой скорости для транспортного средства.
     *
     * @param vehicle Транспортное средство.
     * @return Допустимая скорость.
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            return car.calculateAllowedSpeed();
        } else if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            return bus.calculateAllowedSpeed();
        }
        return 0.0;
    }
}