package javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {

    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}
