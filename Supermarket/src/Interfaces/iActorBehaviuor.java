package Interfaces;

public interface iActorBehaviuor {

    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean takeOrder);
    public void setMakeOrder(boolean makeOrder);
    Classes.Actor getActor();
}
