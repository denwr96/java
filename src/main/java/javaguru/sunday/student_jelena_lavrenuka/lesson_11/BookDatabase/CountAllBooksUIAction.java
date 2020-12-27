package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

class CountAllBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        bookDatabase.countAllBooks();
    }
}
