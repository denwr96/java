package javaguru.sunday.student_nataliya_sinitsa.lesson11.level4.task27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {

    public static void main(String[] args) {

        UniqueWordFinder victim = new UniqueWordFinder();

        Set<String> actualSet = victim.find("A well a everybody is heard about the bird\n" +
                "Bird bird bird bird is a word\n" +
                "A well a bird bird bird bird is a word\n" +
                "A well a bird bird bird bird is a word");

        Set<String> expectedSet = new HashSet<>();
        expectedSet.add("a");
        expectedSet.add("well");
        expectedSet.add("everybody");
        expectedSet.add("is");
        expectedSet.add("heard");
        expectedSet.add("about");
        expectedSet.add("the");
        expectedSet.add("bird");
        expectedSet.add("word");

        check(actualSet.equals(expectedSet), "Should find unique words");

    }

    public static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}

