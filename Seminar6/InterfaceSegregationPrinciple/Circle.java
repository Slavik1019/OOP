/**
 * Класс, представляющий круг.
 */
public class Circle implements Shape {
    private double radius; // Радиус круга

    /**
     * Конструктор класса Circle.
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисление площади круга.
     * @return Площадь круга.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}




