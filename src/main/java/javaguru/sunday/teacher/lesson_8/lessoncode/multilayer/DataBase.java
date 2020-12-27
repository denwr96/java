package javaguru.sunday.teacher.lesson_8.lessoncode.multilayer;

import java.util.List;

public abstract class DataBase {

    private List<String> storage;

    public void save(String userInputString) {
        storage.add(userInputString);
    }

    public String read(int userInt) {
        return String.valueOf(userInt);
    }

    abstract void howToConnect();

    abstract void howToBuildAQuery();
}
