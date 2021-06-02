package sample.weapon.decorator;

public class ThrowingHangar implements WeaponHangar {

    @Override
    public void returnToHangar() {
        System.out.println("Throwing weapon returned to the hangar");
    }
}
