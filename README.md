# Assignment 2 — Game Equipment Factories

This project implements Factory Method and Abstract Factory patterns for creating game equipment (weapons and armor sets for Orc and Elf factions).

## Clean Code Principles

### 1. Programming to Interfaces
Client code in `Main` works exclusively through `CharacterEquipmentFactory`, `Weapon`, and `Armor` interfaces instead of concrete classes.

*Before (Direct coupling):*
```java
OrcAxe axe = new OrcAxe();

After (Decoupled via Interface):
Weapon weapon = factory.createWeapon();

2. Single Responsibility Principle (SRP)
The creation logic for items is separated into factory classes (OrcEquipmentFactory, ElfEquipmentFactory) rather than being handled inside the main game loop or character class.

3. Open/Closed Principle (OCP)
New equipment sets or factions can be added by creating a new factory class implementing CharacterEquipmentFactory without changing existing client code.

4. Meaningful Naming
All classes and methods strictly follow domain concepts (createWeapon(), HeavyOrcArmor, SwordFactory).

5. Elimination of Conditional Logic for Instantiation
Instead of using complex if-else or switch blocks to determine which item to instantiate, polymorphism is used through factory methods.
