package home_work_18;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll();
        Queen queen = new Queen();
        King king = new King();
        Knight knight = new Knight();

        troll.fight();
        queen.fight();
        king.fight();
        knight.fight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }
}
