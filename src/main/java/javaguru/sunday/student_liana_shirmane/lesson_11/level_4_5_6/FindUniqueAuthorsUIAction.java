package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38



class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("In book database there are unique authors " + bookDatabase.findUniqueAuthors() + " books");

    }

}