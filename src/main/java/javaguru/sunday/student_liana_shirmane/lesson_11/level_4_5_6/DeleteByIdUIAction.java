package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task35

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the id of the book you would like to delete");
        Long id = scanner.nextLong();

        if (bookDatabase.delete(id)) {
            System.out.println("Book is deleted");
        } else System.out.println("No such book in database");
    }
}