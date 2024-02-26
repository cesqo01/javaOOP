package org.example;

public class BottleOfWater extends Product {
    private double volume;



    public BottleOfWater(String name, int cost, double volume){
        super(name,cost, volume);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "HomeTask2.BottleOfWater{" +
                "name=" + super.getName() +'\'' +
                ", cost=" + super.getCost() +
                ", volume=" + volume +
                '}';
    }
}
