package main.java.javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import java.util.LinkedHashSet;
import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.findTest();

    }

    public void findTest() {
        UniqueWordFinder test = new UniqueWordFinder();
        LinkedHashSet<String> expectedResult = new LinkedHashSet<>();
        expectedResult.add("Hello");
        expectedResult.add("my");
        expectedResult.add("name");
        expectedResult.add("is");
        expectedResult.add("Sergej");
        check(expectedResult, test.find("Hello my name is Sergej"), "findTest");

    }

    public void check(Set<String> expectedResult, Set<String> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
