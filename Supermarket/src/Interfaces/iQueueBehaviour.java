package Interfaces;

public interface iQueueBehaviour {

    void  takeInQueue(iActorBehaviuor iActorBehaviuor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
