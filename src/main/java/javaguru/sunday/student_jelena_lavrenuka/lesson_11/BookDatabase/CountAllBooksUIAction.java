package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;


import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CountAllBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        bookDatabase.countAllBooks();
    }
}
