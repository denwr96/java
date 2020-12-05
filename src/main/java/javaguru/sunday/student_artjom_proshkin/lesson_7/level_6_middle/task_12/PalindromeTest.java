package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_12;


class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromePassTest();
        test.isPalindromeFailTest();

    }

    void isPalindromePassTest() {
        Palindrome victim = new Palindrome();
        boolean actual = victim.isPalindrome("Он дивен палиндром! И ни морд, ни лап не видно.");
        checkResult(actual, "isPalindromePassTest");
    }
    void isPalindromeFailTest() {
        Palindrome victim = new Palindrome();
        boolean actual = victim.isPalindrome("Баобаб");
        checkResult(! actual, "isPalindromeFailTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
