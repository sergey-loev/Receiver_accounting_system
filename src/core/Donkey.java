package core;

import controller.AnimalKind;

import java.util.Date;
import java.util.List;

public class Donkey extends PackAnimal {
    public Donkey(String name, Date birthday, List<String> commands) {
        super(AnimalKind.Donkey, name, birthday, commands);
    }
}
