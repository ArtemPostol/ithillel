package home_work_16;

public class Baggage {
    private int amount;
    private int customsFee;

    public int getFee() {
        return this.customsFee * this.amount;
    }

    public Baggage(int amount, int customsFee) {
        this.amount = amount;
        this.customsFee = customsFee;
    }
    @Override
    public String toString() {
        return "Baggage{" +
                " amount=" + this.amount +
                ", fee=" + getFee() + "$" +
                '}';
    }
}
