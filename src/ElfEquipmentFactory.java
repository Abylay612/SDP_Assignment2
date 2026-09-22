public class ElfEquipmentFactory implements CharacterEquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LightElfArmor();
    }
}
