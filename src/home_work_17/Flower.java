package home_work_17;

public class Flower {
    private String name;
    private double cost;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public Flower(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public static Flower getRandomFlower() {
        Flower[] flowerArray = new Flower[]{new Rose(), new Tulip(), new Lily(), new Carnation()};
        int tempInt = (int) (Math.random() * (4));
        return flowerArray[tempInt];
    }

    @Override
    public String toString() {
        return this.getName() + " ("+ getCost() +")";
    }
}