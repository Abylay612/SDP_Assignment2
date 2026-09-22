public abstract class WeaponFactory {
    // Factory Method
    public abstract Weapon createWeapon();

    public void prepareWeapon() {
        Weapon weapon = createWeapon();
        weapon.use();
    }
}
