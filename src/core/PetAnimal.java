package core;

import controller.AnimalKind;
import controller.AnimalType;

import java.util.Date;
import java.util.List;

public abstract class PetAnimal extends Animal{
    public PetAnimal(AnimalKind kind, String name, Date birthday, List<String> commands) {
        super(AnimalType.PetAnimal, kind, name, birthday, commands);
    }
}
