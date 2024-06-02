package core;

import controller.AnimalKind;
import controller.AnimalType;

import java.util.Date;
import java.util.List;

public abstract class PackAnimal extends Animal{
    public PackAnimal(AnimalKind kind, String name, Date birthday, List<String> commands) {
        super(AnimalType.PackAnimal, kind, name, birthday, commands);
    }
}
