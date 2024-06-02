package core;

import controller.AnimalKind;

import java.util.Date;
import java.util.List;

public class Hamster extends PetAnimal {
    public Hamster(String name, Date birthday, List<String> commands) {
        super(AnimalKind.Hamster, name, birthday, commands);
    }
}
