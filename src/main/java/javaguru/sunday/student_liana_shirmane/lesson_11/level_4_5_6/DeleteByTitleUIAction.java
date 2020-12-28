package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to delete");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);
        System.out.println("Book is deleted");

    }

}