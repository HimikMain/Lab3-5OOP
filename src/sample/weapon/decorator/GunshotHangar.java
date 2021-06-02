package sample.weapon.decorator;

public class GunshotHangar implements WeaponHangar {

    @Override
    public void returnToHangar() {
        System.out.println("Gunshot weapon returned to the hangar");
    }
}
