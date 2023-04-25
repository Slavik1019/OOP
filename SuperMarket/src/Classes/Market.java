package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;


import java.util.ArrayList;
import java.util.List;

/**Имплементация в класс Маркет интерфейсов iMarketBehaviour, iQueueBehaviour*/
public class Market implements iMarketBehaviour, iQueueBehaviour {
    //private List<Actor> queue;
    /**поле список очередей методов*/
    private List<iActorBehaviour> queue;
    /**метод Market*/
    public Market() {
        //this.queue = new ArrayList<Actor>();
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**Переопределение метода зайти в магазин
     * @param actor
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (actor instanceof ActionClient) {
            ActionClient ActionClient = (ActionClient) actor;
            System.out.println(ActionClient.getName() + " клиент пришел в магазин по акции " + ActionClient.getActionName() + " с номером в акции " + ActionClient.getNumberOfActionClient());
        } else {
            System.out.println(actor.getActor().getName() + " клиент пришел в магазин");
        }
        takeInQueue(actor);
    }

    /**Переопределение метода покинуть магазин
     * @param actors
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor.getActor().getName() + " клиент ушел из магазина ");
            this.queue.remove(actor);
        }

    }

    /**Переопределениие метода обновление статусов при покупках*/
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        //returnOrder();
        releaseFromQueue();
    }

    /**Переопределение метода обновление статусов при возврате товара*/
    @Override
    public void returnZak() {
        returnOrder();
        releaseFromQueue();
    }

    /**Переопределение метода встать в очередь
     * @param actor
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**Переопределение метода встать в очередь*/
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor: queue) {
            if (actor.isTakeOrder() || actor.isReturnOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**Переопределение метода забрать заказ*/
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor:queue) {
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }

        }

    }
    /**Переопределение метода сделать заказ*/
    @Override
public void giveOrder() {
    for (iActorBehaviour actor : queue) {
        if (actor.isMakeOrder()) {
            actor.setTakeOrder(true);
            if (actor instanceof ActionClient) {
                ActionClient ActionClient = (ActionClient) actor;
                System.out.println(ActionClient.getName() + " клиент получил свой заказ по акции " + ActionClient.getActionName());
            } else {
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ");
            }
        }
    }
}
    /**Переопределение метода вернуть заказ*/
    @Override
    public void returnOrder() {
        for (iActorBehaviour actor: queue) {
            if (!actor.isReturnOrder()) {
                actor.setReturnOrder(true);
                System.out.println(actor.getActor().getName() + " клиент вернул свой заказ ");
            }
        }
    }

}