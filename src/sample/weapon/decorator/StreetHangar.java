package sample.weapon.decorator;

public class StreetHangar implements WeaponHangar {

    @Override
    public void returnToHangar() {
        System.out.println("Street weapon returned to the hangar");
    }
}
