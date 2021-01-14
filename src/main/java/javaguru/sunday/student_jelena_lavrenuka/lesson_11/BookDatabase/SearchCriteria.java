package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {
    boolean match(Book book);
}
