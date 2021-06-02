package sample.weapon.parametrs;

public class LightWeapon implements Range {
    private static Range range;

    private LightWeapon() {

    }

    public static Range getParametrs() {
        if (range != null)
            return range;
        range = new LightWeapon();
        return range;
    }

    @Override
    public String getRange() {
        return "1";
    }
}
