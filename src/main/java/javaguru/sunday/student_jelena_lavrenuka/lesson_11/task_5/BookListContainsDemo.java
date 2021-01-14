package javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не использующийся код можно удалять")
class BookListContainsDemo {
    List<Book> bookList = new ArrayList<>();

    public boolean bookListContainsRequestedBook(Book book){
        if(bookList.contains(book)){
            return true;
        }
        return false;
    }
}
