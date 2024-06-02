package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import core.*;
import exceptions.ExceptionEmptyField;
import view.Menu;

public class Controller {
    private List<Animal> animals;
    private Menu menu;
    private Counter counter;

    public Controller() {
        this.animals = new ArrayList<Animal>();
        this.menu = new Menu();
        this.counter = new Counter();
    }

    public void Run() throws Exception {
        Commands command = Commands.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            menu.PrintMenu();
            command = menu.GetMenuChoise("Выберите действие");
            switch (command) {
                case EXIT:
                    getNewIter = false;
                    break;
                case PRINTANIMALS:
                    PrintAnimals();
                    break;
                case ADDANIMAL:
                    AddTypeAnimal();
                    break;
                case ADDCOMMAND:
                    AddCommand();
                    break;
                case PRINTCOMMANDS:
                    PrintCommands();
                    break;
                case REMOVECOMMAND:
                    RemoveCommand();
                    break;
                case REMOVEANIMAL:
                    RemoveAnimal();
                    break;
                case PRINTCOUNTER:
                    PrintCount();
                    break;
                default:
                    menu.PrintMenu();
            }
        }
    }

    private void PrintCommands() {
        int index = Integer.parseInt(menu.Prompt("Введите номер животного:"));
        menu.PrintString("Животное знает команды: " + animals.get(index - 1).GetComands());

    }

    public void PrintAnimals() {
        int i = 1;
        for (Animal animal : animals) {
            System.out.println(i + ". " + animal);
            i++;
        }

    }

    public void AddCommand() {
        int index = Integer.parseInt(menu.Prompt("Введите номер животного:"));
        String newcommand = menu.Prompt("Введите новую команду:");
        animals.get(index - 1).AddCommand(newcommand);
    }

    public void RemoveCommand() {
        int index = Integer.parseInt(menu.Prompt("Введите номер животного:"));
        String newcommand = menu.Prompt("Введите удаляемую команду:");
        boolean result = animals.get(index - 1).RemoveCommand(newcommand);
        if (result) menu.PrintString("Команда успешно удалена");
        else menu.PrintString("Команда для удаления не найдена");
    }

    public void RemoveAnimal() {
        int index = Integer.parseInt(menu.Prompt("Введите номер животного:"));
        animals.remove(index - 1);
        counter.reduceСounter();
    }

    public void PrintCount() {
        menu.PrintString("Количество животных в питомнике- " + counter.getCount());
    }

    public void AddTypeAnimal() throws ParseException, ExceptionEmptyField {
        menu.PrintTypeMenu();
        boolean getNewIter = true;
        while (getNewIter) {
            int index = Integer.parseInt(menu.Prompt("Введите номер типа животного:"));
            if (index == 1) {
                AddKindAnimal(AnimalType.PetAnimal);
                getNewIter = false;
            }
            else if (index == 2) {
                AddKindAnimal(AnimalType.PackAnimal);
                getNewIter = false;
            }
            else if (index == 0) getNewIter = false;
            else menu.PrintString("Введено некорректное значение");
        }

    }

    public void AddKindAnimal(AnimalType type) throws ParseException, ExceptionEmptyField {
        if (type == AnimalType.PetAnimal){
            menu.PrintKindeOfPetMenu();
            boolean getNewIter = true;
            while (getNewIter) {
                int index = Integer.parseInt(menu.Prompt("Введите номер вида животного:"));
                if (index == 1) {
                    AddAnimal(AnimalKind.Cat);
                    getNewIter = false;
                }
                else if (index == 2) {
                    AddAnimal(AnimalKind.Dog);
                    getNewIter = false;
                }
                else if (index == 3) {
                    AddAnimal(AnimalKind.Hamster);
                    getNewIter = false;
                }
                else if (index == 0) getNewIter = false;
                else menu.PrintString("Введено некорректное значение");
            }

        }
        else if (type == AnimalType.PackAnimal){
            menu.PrintKindeOfPackMenu();
            boolean getNewIter = true;
            while (getNewIter) {
                int index = Integer.parseInt(menu.Prompt("Введите номер вида животного:"));
                if (index == 1) {
                    AddAnimal(AnimalKind.Horse);
                    getNewIter = false;
                }
                else if (index == 2) {
                    AddAnimal(AnimalKind.Camel);
                    getNewIter = false;
                }
                else if (index == 3) {
                    AddAnimal(AnimalKind.Donkey);
                    getNewIter = false;
                }
                else if (index == 0) getNewIter = false;
                else menu.PrintString("Введено некорректное значение");
            }

        }


    }

    public void AddAnimal(AnimalKind animalKind) throws ParseException, ExceptionEmptyField {

        String name = menu.Prompt("Введите кличку:");
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        Date birthday = formater.parse(menu.Prompt("Введите дату рождения в формате (ДД-ММ-ГГГГ)."));
        String sComands = menu.Prompt("Перечислите команды через запятую.");
        List<String> commands = new ArrayList<String>(Arrays.asList(sComands.split(", ")));

        if (name.isEmpty()) {
            throw new ExceptionEmptyField();
        }

        if (animalKind == AnimalKind.Cat){
            animals.add(new Cat(name,birthday,commands));
        }else if (animalKind == AnimalKind.Dog){
            animals.add(new Dog(name,birthday,commands));
        }else if (animalKind == AnimalKind.Hamster){
            animals.add(new Hamster(name,birthday,commands));
        }else if (animalKind == AnimalKind.Horse){
            animals.add(new Horse(name,birthday,commands));
        }else if (animalKind == AnimalKind.Camel){
            animals.add(new Camel(name,birthday,commands));
        }else if (animalKind == AnimalKind.Donkey){
            animals.add(new Donkey(name,birthday,commands));
        }
        counter.increaseCounter();

    }


}