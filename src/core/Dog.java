package core;

import controller.AnimalKind;

import java.util.Date;
import java.util.List;

public class Dog extends PetAnimal {
    public Dog(String name, Date birthday, List<String> commands){
        super(AnimalKind.Dog, name, birthday, commands);
    }
}
