package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_3_junior;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно не писать: victim.check(banana) == true" +
        "Это избыточно. Если входным параметром у вас boolean, то подавать вы можете " +
        "туда выражение, результатом которого является boolean." +
        "Метод .check уже возвращает boolean, а значит, проверять еще раз на == true не надо.")
public class InMemoryDatabaseTest {
    private InMemoryDatabase victim = new InMemoryDatabase();

    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.inMemoryDatabaseSaveTestShouldReturnTrue();
        inMemoryDatabaseTest.inMemoryDatabaseSaveTestShouldReturnFalse();
        inMemoryDatabaseTest.inMemoryDatabaseFindByTitleTestShouldReturnTrue();
        inMemoryDatabaseTest.inMemoryDatabaseFindByTitleTestShouldReturnFalse();
    }

    public void inMemoryDatabaseSaveTestShouldReturnTrue() {
        Product banana = new Product("Banana");
        victim.save(banana);
        checkResults(victim.check(banana) == true  , "inMemoryDatabaseSaveSaveTestShouldReturnTrue");
    }

    public void inMemoryDatabaseSaveTestShouldReturnFalse() {
        Product banana = new Product("Banana");
        victim.save(banana);
        checkResults(!victim.check(banana) == false  , "inMemoryDatabaseSaveSaveTestShouldReturnFalse");
    }

    public void inMemoryDatabaseFindByTitleTestShouldReturnTrue() {
        Product cocos = new Product("Cocos");
        victim.save(cocos);
        checkResults(victim.findByTitle("Cocos").equals(cocos)  , "inMemoryDatabaseFindByTitleTestShouldReturnTrue");
    }

    public void inMemoryDatabaseFindByTitleTestShouldReturnFalse() {
        Product cocos = new Product("Cocos");
        victim.save(cocos);
        checkResults(!victim.findByTitle("Banana").equals(cocos)  , "inMemoryDatabaseFindByTitleTestShouldReturnFalse");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }

}
