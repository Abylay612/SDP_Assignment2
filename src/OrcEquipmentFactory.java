public class OrcEquipmentFactory implements CharacterEquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword(); // Или OrcAxe
    }

    @Override
    public Armor createArmor() {
        return new HeavyOrcArmor();
    }
}
