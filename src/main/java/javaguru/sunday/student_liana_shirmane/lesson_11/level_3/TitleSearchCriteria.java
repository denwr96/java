package javaguru.sunday.student_liana_shirmane.lesson_11.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//task17
@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }

}

