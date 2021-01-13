package home_work_18;

public class King extends Character {
    private static final String name = "Король";

    public King() {
        super(new SwordBehavior(), name);
    }
}
