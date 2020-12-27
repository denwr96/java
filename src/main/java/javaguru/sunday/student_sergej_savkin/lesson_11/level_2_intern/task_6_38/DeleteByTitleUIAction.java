package main.java.javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import java.util.Scanner;

//task38

class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title to delete: ");
        String title = scanner.next();
        bookDatabase.deleteByTitle(title);
    }


}