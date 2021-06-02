package sample.weapon.weapon;

import sample.weapon.Composite.Order;
import sample.weapon.parametrs.Range;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Knife")
public final class Knife extends StreetWeapon implements Order {
    private final static String TYPE = "Knife";

    public Knife(){
        super(TYPE, null, null);
    }

    public Knife(String model, Range range) {
        super(TYPE, model, range);
    }

    @Override
    public Weapon create(String weaponModel, Range range) {
        return new Knife(weaponModel, range);
    }

    @Override
    public void punch() {
        System.out.println("Knife punch");
    }

    @Override
    public int getCount() {
        return 1;
    }
}
