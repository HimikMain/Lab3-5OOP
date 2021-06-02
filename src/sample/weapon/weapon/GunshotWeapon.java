package sample.weapon.weapon;

import sample.weapon.parametrs.Range;

public abstract class GunshotWeapon extends Weapon {
    protected int rangeOfTheShot;

    protected GunshotWeapon(String weaponType, String weaponModel, Range range) {
        super(weaponType, weaponModel, range);
    }

    public int getRangeOfTheShot() {
        return rangeOfTheShot;
    }

    public void setRangeOfTheShot(int rangeOfTheShot) {
        this.rangeOfTheShot = rangeOfTheShot;
    }

    public abstract void shot();
}
