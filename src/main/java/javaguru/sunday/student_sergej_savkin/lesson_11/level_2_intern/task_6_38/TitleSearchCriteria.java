package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task17

class TitleSearchCriteria implements SearchCriteria{

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
       return book.getTitle().equals(titleToSearch);
    }

}
