/**
 * Класс, представляющий куб.
 */
public class Cube implements Shape {
    private int edge; // Длина ребра куба

    /**
     * Конструктор класса Cube.
     * @param edge Длина ребра куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Вычисление площади куба.
     * @return Площадь куба.
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Вычисление объема куба.
     * @return Объем куба.
     */
    public double volume() {
        return edge * edge * edge;
    }
}