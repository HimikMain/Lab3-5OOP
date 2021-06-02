package sample.weapon.weapon;

import sample.weapon.Composite.Order;
import sample.weapon.parametrs.Range;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Pistol")
public final class Pistol extends GunshotWeapon implements Order {
    private final static String TYPE = "Pistol";

    public Pistol(){
        super(TYPE, null, null);
    }

    public Pistol(String model, Range range) {
        super(TYPE, model, range);
    }

    @Override
    public Weapon create(String weaponModel, Range range) {
        return new Pistol(weaponModel, range);
    }



    @Override
    public void shot() {
        System.out.println("Pistol is shooting");
    }

    @Override
    public int getCount() {
        return 1;
    }
}
