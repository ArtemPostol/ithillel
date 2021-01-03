package home_work_16;

public enum Drinks {
    YES(0,"C напитками", 50),
    NO(1, "Без напитков", 0);

    private final int var;
    private final String description;
    private final int price;

    Drinks(int var, String description, int price) {
        this.var = var;
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "var=" + getVar() +
                ", description='" + getDescription() + '\'' +
                ", price=" + price + '$' +
                '}';
    }
}
