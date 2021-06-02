package sample.weapon.weapon;

import sample.weapon.Composite.Order;
import sample.weapon.parametrs.Range;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Shuriken")
public class Shuriken extends ThrowingWeapon implements Order {
    private final static String TYPE = "Shuriken";

    public Shuriken(){
        super(TYPE, null, null);
    }

    public Shuriken(String model, Range range) {
        super(TYPE, model, range);
    }

    @Override
    public Weapon create(String weaponModel, Range range) {
        return new Shuriken(weaponModel, range);
    }



    @Override
    public void thrown() {
        System.out.println("Shuriken thrown");
    }

    @Override
    public int getCount() {
        return 1;
    }
}
