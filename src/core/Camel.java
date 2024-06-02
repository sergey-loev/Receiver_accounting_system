package core;

import controller.AnimalKind;

import java.util.Date;
import java.util.List;

public class Camel extends PackAnimal {
    public Camel(String name, Date birthday, List<String> commands) {
        super(AnimalKind.Camel, name, birthday, commands);
    }
}
