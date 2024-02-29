package hm2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan", "Shopping");
        Human human2= new Human("Petr","Shopping");

        human1.setStatus("Shopping");
        human2.setStatus("Waiting in Queue");
        market.acceptToMarket(human2);

        market.update();
    }
}
