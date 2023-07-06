package Interfaces;

import Classes.Actor;

/**
 * Определение интерфейса возврата товара в магазин
 */
public interface iReturnOrder {

    /**
     * Покупатель приносит товар в магазин и отдает его
     */
    public boolean refundProduct();

    /**
     * Метод проверки товара магазином, действительно ли товар негодный
     */
    public boolean checkProduct();

    /**
     * Метод отказа в возврате клиенту
     */
    public boolean failureRefund();

    /**
     * Метод возврата денег клиенту
     */
    public void refundMoney();
}
