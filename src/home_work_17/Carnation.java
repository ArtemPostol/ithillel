package home_work_17;

public class Carnation extends Flower {

    public double getCost() {
        return FlowerPriceList.CARNATION.getCost();
    }

    public Carnation() {
        super("Гвоздика", FlowerPriceList.CARNATION.getCost());
    }
}
