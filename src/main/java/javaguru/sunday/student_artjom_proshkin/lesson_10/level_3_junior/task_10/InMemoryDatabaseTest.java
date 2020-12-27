package javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_10;

import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveAndFindDatabaseTest();

    }

    void saveAndFindDatabaseTest() {
        InMemoryDatabase victim = new InMemoryDatabase();
        Product puzzle = new Product("Puzzle");
        Product watch = new Product("Galaxy Watch");
        Product phone = new Product("Nokia 3310");
        victim.save(puzzle);
        victim.save(watch);
        victim.save(phone);

        Optional<Product> findPhone = victim.findByTitle("Nokia 3310");
        findPhone.ifPresent(product -> checkResult(product.equals(phone), "saveAndFindPhoneTest"));

        Optional<Product> findPuzzle = victim.findByTitle("Puzzle");
        findPuzzle.ifPresent(product -> checkResult(product.equals(puzzle), "saveAndFindPuzzleTest"));

        Optional<Product> findWatch = victim.findByTitle("Galaxy Watch");
        findWatch.ifPresent(product -> checkResult(product.equals(watch), "saveAndFindWatchTest"));
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
