package home_work_17;

public enum FlowerPriceList { // для хранения стоимости цветов в одном месте
    ROSE(15.5),
    LILY(20),
    TULIP(10.75),
    CARNATION(12);

    private final double cost;

    FlowerPriceList(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
