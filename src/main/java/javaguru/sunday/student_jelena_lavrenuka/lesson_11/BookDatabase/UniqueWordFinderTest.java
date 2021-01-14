package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Set;

@CodeReview(approved = true)
class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordFinderTest();
    }

    public void uniqueWordFinderTest(){
        UniqueWordFinder victim = new UniqueWordFinder();
        Set<String> testList = victim.find("Вот дом, Который построил Джек. А это пшеница, Которая в темном чулане хранится В доме, Который построил Джек.");
        testResult(testList.size(), 16, "uniqueWordFinderTest");
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
