package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task16

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
