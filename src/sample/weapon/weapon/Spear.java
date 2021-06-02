package sample.weapon.weapon;

import sample.weapon.Composite.Order;
import sample.weapon.parametrs.Range;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Spear")
public final class Spear extends ThrowingWeapon implements Order {
    private final static String TYPE = "Spear";

    public Spear(){
        super(TYPE, null, null);
    }

    public Spear(String model, Range range) {
        super(TYPE, model, range);
    }

    @Override
    public Weapon create(String weaponModel, Range range) {
        return new Spear(weaponModel, range);
    }



    @Override
    public void thrown() {
        System.out.println("Spear is thrown");
    }

    @Override
    public int getCount() {
        return 1;
    }
}
