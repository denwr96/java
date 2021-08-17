package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38


import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("In book database there are unique books " + bookDatabase.findUniqueBooks());

    }

}