package javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_7;

// This interface is not functional
// it contains 2 non-override methods.
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
