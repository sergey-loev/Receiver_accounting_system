package core;

import controller.AnimalKind;

import java.util.Date;
import java.util.List;

public class Cat extends PetAnimal {
    public Cat(String name, Date birthday, List<String> commands) {
        super(AnimalKind.Cat, name, birthday, commands);
    }
}
