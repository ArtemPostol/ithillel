package home_work_16;

public class Meal {
    private Menu menu;
    private Drinks drinks;


    public Menu getMenu() {
        return menu;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public int getPrice() {
        return this.menu.getPrice() + this.drinks.getPrice();
    }

    public Meal(Menu menu, Drinks drinks) {
        this.menu = menu;
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Meal{" +"menu=" +  menu.toString() + " " + "drinks=" + drinks.toString();
    }
}
