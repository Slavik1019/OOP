package Products;
// Объявляем класс "HotDrink" и наследуем его от "Product"
public class HotDrink extends Product {
    private int temperature; // объявляем свойство "температура"
    private int volume; // объявляем свойство "объем"

    // Конструктор класса, который инициализирует все свойства
    public HotDrink(String name, double price, int temperature, int volume) {
        super(name, price); // Вызываем конструктор базового класса
        this.temperature = temperature; // Инициализируем свойство "температура"
        this.volume = volume; // Инициализируем свойство "объем"
    }

    // Геттер для свойства "температура"
    public int getTemperature() {
        return temperature;
    }

    // Сеттер для свойства "температура"
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Геттер для свойства "объем"
    public int getVolume() {
        return volume;
    }

    // Сеттер для свойства "объем"
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Переопределяем метод toString() для вывода информации о горячих напитках
    @Override
    public String toString() {
        return "Напиток: " + getName() + ", Цена: " + getPrice() + ", Температура: " + temperature + ", Объем: " + volume;
    }
}