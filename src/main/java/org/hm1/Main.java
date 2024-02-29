package org.hm1;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottleOfWater machine = new VendingMachineBottleOfWater();
        HotDrinkVendingMachine machine2 = new HotDrinkVendingMachine();
        machine2.addHotDrink(new HotDrink("чай1", 50,100,80));
        machine2.addHotDrink(new HotDrink("чай2", 100,200,50));
        machine2.addHotDrink(new HotDrink("кофе1", 50,100,80));
        machine2.addHotDrink(new HotDrink("кофе2", 100,200,50));
        machine.addBottleOfWatter(new BottleOfWater("Вода1", 100, 5));
        machine.addBottleOfWatter(new BottleOfWater("Вода2", 10, 0.5));
        machine.addBottleOfWatter(new BottleOfWater("Вода3", 1, 1));
        machine.addBottleOfWatter(new BottleOfWater("Вода4", 1000, 500));
        System.out.println(machine.getProduct("Вода1"));
        System.out.println(machine2.getProduct("чай1",80,100));
    }
}