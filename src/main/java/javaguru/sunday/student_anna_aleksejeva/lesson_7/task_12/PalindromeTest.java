package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_7.task_12;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.willBePalindrome();
    }
    void willBePalindrome() {
        Palindrome test = new Palindrome();
        boolean result = test.isPalindrome("No lemon, no melon");
        check(result, "Palindrome");
    }
    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
