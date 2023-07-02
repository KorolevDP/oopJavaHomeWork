package Interfaces;

import java.util.List;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviuor iActorBehaviuor);
    void releaseFromMarket(List<Classes.Actor> actor);
    void update();
}
