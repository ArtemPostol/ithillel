package home_work_18;

public abstract class Character {
    private WeaponBehavior weapon;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public Character(WeaponBehavior weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    public void fight() {
        System.out.println(this.getName()+ " - " + weapon.useWeapon());
    }
}
