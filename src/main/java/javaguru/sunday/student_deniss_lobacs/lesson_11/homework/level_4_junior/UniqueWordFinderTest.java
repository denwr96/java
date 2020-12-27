package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_4_junior;
// task27
public class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.testShouldBeOk();
        uniqueWordFinderTest.testShouldBeFail();
    }

    public void testShouldBeOk() {
        UniqueWordFinder victim = new UniqueWordFinder();
        var result = victim.find("Asd asd asd asd aaa aaa bb bb b b a a cc cc c");
        if (result.size() == 8) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test is failed!");
        }
    }
    public void testShouldBeFail() {
        UniqueWordFinder victim = new UniqueWordFinder();
        var result = victim.find("Asd asd asd asd aaa aaa bb bb b b a a cc cc c");
        if (result.size() == 15) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test is failed!");
        }
    }

}
