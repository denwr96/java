package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria;

// Task 16 (level 3)

import main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

}
