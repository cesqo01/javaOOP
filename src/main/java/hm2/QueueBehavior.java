package hm2;

import java.util.List;

import java.util.List;

public interface QueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
    void releaseFromMarket(List<Actor> actors);
}
