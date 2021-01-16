package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria;


// Task 15 (level 3)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {

    boolean match(Book book);
}
