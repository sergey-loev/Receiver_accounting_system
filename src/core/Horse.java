package core;

import controller.AnimalKind;

import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal {
    public Horse(String name, Date birthday, List<String> commands) {
        super(AnimalKind.Horse, name, birthday, commands);
    }
}
