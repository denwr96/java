package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.level_4;

// Task 27 (level 4)

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.uniqueWordFinderTest();

    }

    void uniqueWordFinderTest() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

        System.out.println(uniqueWordFinder.find("один два три один два три четыре"));

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("один");
        expectedResult.add("два");
        expectedResult.add("три");
        expectedResult.add("четыре");

        checkResults(expectedResult.containsAll(uniqueWordFinder.find("один два три один два три четыре")), "Unique word finder test");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
