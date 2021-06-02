package sample.weapon.parametrs;

public class HeavyWeapon implements Range {
    private static Range range;

    private HeavyWeapon() {

    }

    public static Range getParametrs() {
        if (range != null)
            return range;
        range = new HeavyWeapon();
        return range;
    }

    @Override
    public String getRange() {
        return "50";
    }
}
