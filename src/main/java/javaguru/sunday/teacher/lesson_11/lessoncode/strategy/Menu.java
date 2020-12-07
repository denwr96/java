package main.java.javaguru.sunday.teacher.lesson_11.lessoncode.strategy;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static void main(String[] args) {
        Map<Integer, UICommand> menu = new HashMap<>();

        menu.put(1, new AddProduct());
        menu.put(2, new RemoveProduct());

        int input = 2;

        UICommand uiCommand = menu.get(2);
        uiCommand.execute();
    }
}
