package sample.weapon.decorator;

public class WeaponHangarDecorator implements WeaponHangar {
    WeaponHangar wrap;

    public WeaponHangarDecorator(WeaponHangar weaponHangar) {
        this.wrap = weaponHangar;
    }

    @Override
    public void returnToHangar() {
        wrap.returnToHangar();
    }
}
