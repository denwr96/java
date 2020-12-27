package javaguru.sunday.student_liana_shirmane.lesson_11.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//task16
@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }

}

