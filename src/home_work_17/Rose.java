package home_work_17;

public class Rose extends Flower {
    @Override
    public double getCost() {
        return FlowerPriceList.ROSE.getCost();
    }

    public Rose() {
        super("Роза", FlowerPriceList.ROSE.getCost());
    }
}
