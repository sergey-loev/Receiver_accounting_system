package core;

import controller.AnimalKind;
import controller.AnimalType;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    private AnimalType type;
    private AnimalKind kind;
    private String name;
    private Date birthday;
    private List<String> commands;

    public Animal(AnimalType type, AnimalKind kind,String name, Date birthday, List<String> commands) {
        this.type = type;
        this.kind = kind;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public void AddCommand(String command) {
        if (!this.commands.contains(command))
            this.commands.add(command);
    }

    public List<String> GetComands() {
        return this.commands;
    }

    public boolean RemoveCommand(String command) {
        if (this.commands.contains(command)) {
            this.commands.remove(command);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        return "Животное:" +
                "\nКласс (" + type + ")" +
                ", Вид (" + kind + ")" +
                ", Кличка - " + name +
                ", Дата рождения - " + formater.format(birthday) +
                ", Знает команды - " + commands;
    }

}