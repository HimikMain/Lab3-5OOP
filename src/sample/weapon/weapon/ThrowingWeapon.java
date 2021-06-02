package sample.weapon.weapon;

import sample.weapon.parametrs.Range;

public abstract class ThrowingWeapon extends Weapon {
    enum THROW_UNIT{THROW_RANGE, THROW_POWER}
    protected THROW_UNIT throwUnit;

    protected ThrowingWeapon(String weaponType, String weaponModel, Range range) {
        super(weaponType, weaponModel, range);
    }

    public THROW_UNIT getThrowUnit() {
        return throwUnit;
    }

    public void setThrowUnit(THROW_UNIT driveUnit) {
        this.throwUnit = throwUnit;
    }

    public abstract void thrown();
}
