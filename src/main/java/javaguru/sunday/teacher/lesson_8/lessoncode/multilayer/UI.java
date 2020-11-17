package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.multilayer;

public class UI {

    private Service service;

    public UI(Service service) {
        this.service = service;
    }

    public void askUser(String userInputString) {
        service.putIntoDataBase(userInputString);
    }

    public String giveUserSomeInfo(int userInt) {
        return service.readFromDataBase(userInt);
    }

    public void newFunctyonality() {
        service.doSomethingNew();
    }
}
