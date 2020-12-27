package javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_8;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveAndFindDatabaseTest();

    }

    void saveAndFindDatabaseTest (){
        InMemoryDatabase victim = new InMemoryDatabase();
        Product puzzle = new Product("Puzzle");
        Product watch = new Product("Galaxy Watch");
        Product phone = new Product("Nokia 3310");
        victim.save(puzzle);
        victim.save(watch);
        victim.save(phone);
        checkResult(victim.findByTitle("Nokia 3310").equals(phone),"saveAndFindPhoneTest");
        checkResult(victim.findByTitle("Puzzle").equals(puzzle),"saveAndFindPuzzleTest");
        checkResult(victim.findByTitle("Galaxy Watch").equals(watch),"saveAndFindWatchTest");

    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
