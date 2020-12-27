package javaguru.sunday.student_nataliya_sinitsa.lesson10.level3.task7;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.shouldAddProduct1();
        test.shouldAddProduct2();
        test.shouldReturnNullBySearch();
    }

    public void shouldAddProduct1() {
        InMemoryDatabase victim = new InMemoryDatabase();
        victim.save(new Product("apple"));
        victim.save(new Product("banana"));
        victim.save(new Product("coconut"));
        Product testProduct1 = new Product("apple");
        check(victim.findByTitle("apple").equals(testProduct1), "shouldAddProduct1");
    }


    public void shouldAddProduct2() {
        InMemoryDatabase victim = new InMemoryDatabase();
        victim.save(new Product("apple"));
        victim.save(new Product("banana"));
        victim.save(new Product("coconut"));
        Product testProduct2 = new Product("banana");
        check(victim.findByTitle("banana").equals(testProduct2), "shouldAddProduct2");
    }

    public void shouldReturnNullBySearch() {
        InMemoryDatabase victim = new InMemoryDatabase();
        victim.save(new Product("apple"));
        victim.save(new Product("banana"));
        victim.save(new Product("coconut"));
        check(victim.findByTitle("compot") == null, "shouldReturnNullBySearch");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
