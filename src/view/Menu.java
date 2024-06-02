package view;

import java.util.Scanner;
import controller.Commands;

public class Menu {

    public void PrintMenu() {
        System.out.println("");
        System.out.println("==================================");
        System.out.println("1. Вывести список животных");
        System.out.println("2. Добавить животное");
        System.out.println("3. Обучить командам");
        System.out.println("4. Вывести список команд");
        System.out.println("5. Забыть команду");
        System.out.println("6. Удалить животное");
        System.out.println("7. Вывести значение счетчика");

        System.out.println("0. Выход");
    }

    public void PrintTypeMenu() {
        System.out.println("");
        System.out.println("==================================");
        System.out.println("1. Домашнее животное");
        System.out.println("2. Вьючное животное");
        System.out.println("");
        System.out.println("0. Отмена");
    }

    public void PrintKindeOfPetMenu() {
        System.out.println("");
        System.out.println("==================================");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Хомяк");
        System.out.println("");
        System.out.println("0. Отмена");
    }

    public void PrintKindeOfPackMenu() {
        System.out.println("");
        System.out.println("==================================");
        System.out.println("1. Лошадь");
        System.out.println("2. Верблюд");
        System.out.println("3. Осел");
        System.out.println("");
        System.out.println("0. Отмена");
    }

    public String Prompt(String s) {
        Scanner in = new Scanner(System.in);
        System.out.println(s);
        return in.nextLine();
    }

    public void PrintString(String s) {
        System.out.println(s);
    }

    public Commands GetMenuChoise(String s) {
        String command = Prompt(s);

        switch (command) {
            case "0":
                return Commands.EXIT;
            case "1":
                return Commands.PRINTANIMALS;
            case "2":
                return Commands.ADDANIMAL;
            case "3":
                return Commands.ADDCOMMAND;
            case "4":
                return Commands.PRINTCOMMANDS;
            case "5":
                return Commands.REMOVECOMMAND;
            case "6":
                return Commands.REMOVEANIMAL;
            case "7":
                return Commands.PRINTCOUNTER;
        }
        return Commands.NONE;

    }

}