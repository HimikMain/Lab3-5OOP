package sample.weapon.weapon;

import sample.weapon.Composite.Order;
import sample.weapon.parametrs.Range;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Knuckles")
public final class Knuckles extends StreetWeapon implements Order {
    private final static String TYPE = "Knuckles";

    public Knuckles(){
        super(TYPE, null, null);
    }

    public Knuckles(String model, Range range) {
        super(TYPE, model, range);
    }

    @Override
    public Weapon create(String weaponModel, Range range) {
        return new Knuckles(weaponModel, range);
    }



    @Override
    public void punch() {
        System.out.println("Knuckles punch");

    }

    @Override
    public int getCount() {
        return 1;
    }
}
