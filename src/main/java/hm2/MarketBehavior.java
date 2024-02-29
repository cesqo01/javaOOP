package hm2;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void update();
}