import Classes.*;
import Interfaces.iActorBehaviuor;

public class Main {
    public static void main(String[] args) throws Exception{

       Market magnit = new Market(); // создаем объект магазина

        // создаем клиентов нашего магазина, с различными параметрами
       iActorBehaviuor client1 = new OrdinaryClient("Boris");
       iActorBehaviuor client2 = new SpecialClient("Peskov", 1000);
       iActorBehaviuor p = new PensionerClient("Oleg Vitali4", 1111);
       iActorBehaviuor tax = new TaxService();
       iActorBehaviuor prom1 = new PromotionClient("Dima", 190, "50% скидка на молоко");
       iActorBehaviuor prom2 = new PromotionClient("Anna De Armas", 191, "25% скидка на колбасу");

       // добавляем клиентов в общий список
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(prom1);
        magnit.acceptToMarket(prom2);

        // заставляем наших клиентов совершать действия в магазине
        magnit.update();
    }
}