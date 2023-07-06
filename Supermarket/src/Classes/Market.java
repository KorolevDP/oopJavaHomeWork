package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviuor; // подключаем интерфейс клиента
import Interfaces.iMarketBehaviour; // подключаем интерфейс поведения в магазине
import Interfaces.iQueueBehaviour; // подключаем интерфейс очереди

/**
 *  Класс магазина
 */
public class Market implements iMarketBehaviour,iQueueBehaviour {

    /**
     *  Список, в которой помещяется очередь магазина
     */
    private List<iActorBehaviuor> queue;

    /**
     * Конструктор магазина
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
    }

    /**
     * Метод обрабатывающий появление клиента в магазине
     * @param actor клиент, который попадает в магазин
     */
    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин " );
        takeInQueue(actor);
    }

    /**
     * Метод добавления клиента в очередь
     * @param actor клиент, которого нужно принять
     */
    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }


    /**
     * Метод выхода клиента из магазина
     * @param actors список клиентов, выходящих из магазина
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     *  Метод вызывающий действия в магазине:
     *  - сделать заказ
     *  - получить заказ
     *  - выйти из очереди
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод получения заказа
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviuor actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }

    /**
     * Метод освобождения очереди клиентов
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviuor actor:queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод приема заказа
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviuor actor:queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }
    }

}