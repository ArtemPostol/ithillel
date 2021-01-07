package home_work_17;

public class Bouquet {
    private int count;
    private double cost;
    private Flower[] flowers;

    public Bouquet(int count) {
        this.count = count;
        this.flowers = new Flower[count];
        for (int i = 0; i < this.count; i++) {
            flowers[i] = Flower.getRandomFlower();
        }
    }

    public double getCost() {
        for (int i = 0; i < count; i++) {
            this.cost += this.flowers[i].getCost();
        }
        return this.cost;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.flowers.length; i++) {
            stringBuilder.append("#").append(i+1).append(" ").append(this.flowers[i].toString()).append('\n');
        }
        return stringBuilder.toString() + "Стоимость букета - " + this.getCost();
    }
}
