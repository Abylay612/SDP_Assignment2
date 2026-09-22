public class BowFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
