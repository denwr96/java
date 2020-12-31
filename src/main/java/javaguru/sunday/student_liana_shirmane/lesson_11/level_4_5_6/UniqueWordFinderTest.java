package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task27

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.shouldFindUniqueWords();
    }

    void shouldFindUniqueWords(){
    UniqueWordFinder victim = new UniqueWordFinder();
        Set<String> actualResult = victim.find("Word one, Word: Two! Word - Three");
        Set<String> expectedResult = new LinkedHashSet<>();
        expectedResult.add("Word");
        expectedResult.add("one");
        expectedResult.add("Two");
        expectedResult.add("Three");
        check(expectedResult, actualResult, "Find unique words test");
    }

    public void check(Set expectedResult,  Set actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

}
