package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**Абстрактный класс Actor с имплементируемыми интерфейсами iActorBehaviour, iReturnOrder
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /**поле имя*/
    protected String name;
    /**поле забрать заказ*/
    protected boolean isTakeOrder;
    /**поле сделать заказ*/
    protected boolean isMakeOrder;
    /**поле вернуть заказ*/
    protected boolean isReturnOrder;

    /**Конструктор Actor
     * @param name
     */
    public Actor(String name) {
        this.name = name;
    }

    /**Абстрактны геттер getName()*/
    public abstract String getName();
}