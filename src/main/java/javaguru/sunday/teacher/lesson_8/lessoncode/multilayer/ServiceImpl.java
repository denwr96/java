package javaguru.sunday.teacher.lesson_8.lessoncode.multilayer;

public class ServiceImpl implements Service {

    private DataBase dataBase;

    public void putIntoDataBase(String userInputString) {
        dataBase.save(userInputString);
    }

    public String readFromDataBase(int userInt) {
        return dataBase.read(userInt);
    }

    public void doSomethingNew() {

    }
}
