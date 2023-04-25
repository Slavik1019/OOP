package Classes;

/**Создание наследика класса Actor*/
public class OrdinaryClient extends Actor {
    /** Конструктор из 1 переменной
     * @param name
     */
    public OrdinaryClient(String name) {
        super(name);
    }
    /** Переопределение геттера getName()*/
    @Override
    public String getName() {
        return super.name;
    }
    /** Переопределение сеттера сделать заказ*/
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    /** Переопределение сеттера взять заказ*/
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }
    /** Переопределение метода сделать заказ*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /** Переопределение метода взять заказ*/
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /** Переопределение сеттера вернуть заказ*/
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }
    /** Переопределение метода вернуть заказ*/
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    /** Переопределение геттера Actor*/
    @Override
    public Actor getActor() {
        return this;
    }
}