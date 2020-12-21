package main.java.javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;


import java.util.Scanner;

//task38

class ContainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.next();
        System.out.println("Please enter book title: ");
        String title = scanner.next();
        Book book = new Book(author, title);
        if(bookDatabase.contains(book)) {
            System.out.println("This book exists in library");
        } else {
            System.out.println("This book doesn't exist in library");
        }
    }
}
