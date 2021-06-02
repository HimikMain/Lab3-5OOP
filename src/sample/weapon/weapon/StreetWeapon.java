package sample.weapon.weapon;

import sample.weapon.parametrs.Range;

public abstract class StreetWeapon extends Weapon {
    protected int displacement;

    protected StreetWeapon(String weaponType, String weaponModel, Range range) {
        super(weaponType, weaponModel, range);
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public abstract void punch();
}
