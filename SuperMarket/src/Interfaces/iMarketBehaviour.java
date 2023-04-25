package Interfaces;

import Classes.Actor;

import java.util.List;

public interface iMarketBehaviour {
    void acceptToMarket (iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

    void returnZak ();
}
