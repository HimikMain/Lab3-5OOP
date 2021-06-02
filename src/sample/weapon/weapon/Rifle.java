package sample.weapon.weapon;

import sample.weapon.parametrs.Range;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Rifle")
public final class Rifle extends GunshotWeapon {
    private final static String TYPE = "Rifle";

    public Rifle() {
        super(TYPE, null, null);
    }

    public Rifle(String model, Range range) {
        super(TYPE, model, range);
    }

    @Override
    public Weapon create(String weaponModel, Range engine) {
        return new Rifle(weaponModel, range);
    }



    @Override
    public void shot() {
        System.out.println("Rifle is shooting");
    }
}
