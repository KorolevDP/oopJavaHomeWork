package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 *  Интерфейс содержащий методы для описания поведения клиентов в магазине
 */
public interface iMarketBehaviour {
    /**
     * Прием клиента в магазин
     * @param actor клиент, который попадает в магазин
     */
    void acceptToMarket(iActorBehaviuor actor);

    /**
     * Вывод клиентов из магазина
     * @param actor список клиентов, выходящих из магазина
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     *
     */
    void update();
}
