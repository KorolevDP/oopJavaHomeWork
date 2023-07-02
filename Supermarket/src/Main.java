import Classes.*;
import Interfaces.iActorBehaviuor;

public class Main {
    public static void main(String[] args) throws Exception{

        Market magnit = new Market();
       iActorBehaviuor client1 = new OrdinaryClient("Boris");
       iActorBehaviuor client2 = new SpecialClient("Peskov", 1000);
       iActorBehaviuor p = new PensionerClient("Oleg Vitali4", 1111);
       iActorBehaviuor tax = new TaxService();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);

        magnit.update();
    }
}