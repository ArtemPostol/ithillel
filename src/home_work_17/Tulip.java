package home_work_17;

public class Tulip extends Flower {
    @Override
    public double getCost() {
        return FlowerPriceList.TULIP.getCost();
    }

    public Tulip() {
        super("Тюльпан", FlowerPriceList.TULIP.getCost());
    }
}
