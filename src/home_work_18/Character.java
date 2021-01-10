package home_work_18;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.useWeapon();
    }
}
