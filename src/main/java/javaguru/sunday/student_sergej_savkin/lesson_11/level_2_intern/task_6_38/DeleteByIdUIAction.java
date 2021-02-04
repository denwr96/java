package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

//task35

@CodeReview(approved = true)
class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book id to delete: ");
        Long bookIdToDelete = scanner.nextLong();
        bookDatabase.delete(bookIdToDelete);
    }
}
