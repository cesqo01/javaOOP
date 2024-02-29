package hm2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior {
    private List<Actor> queue = new ArrayList<>();


    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " Вышел из магазина");
            queue.remove(actor);
        }

    }



    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " Встал в очередь");
        queue.add(actor);

    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ");
            }

        }

    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил заказ");
            }

        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActor = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releasedActor.add(actor);
                System.out.println(actor.getName() + " Вышел из очереди");

            }
        }
        releaseFromMarket(releasedActor);
    }
}
