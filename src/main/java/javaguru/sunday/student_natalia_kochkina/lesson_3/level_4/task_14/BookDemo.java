package javaguru.sunday.student_natalia_kochkina.lesson_3.level_4.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BookDemo {
    
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
