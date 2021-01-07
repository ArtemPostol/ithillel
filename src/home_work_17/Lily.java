package home_work_17;

public class Lily extends Flower {
    @Override
    public double getCost() {
        return  FlowerPriceList.LILY.getCost();
    }
    public Lily() {
        super("Лилия", FlowerPriceList.LILY.getCost());
    }
}
