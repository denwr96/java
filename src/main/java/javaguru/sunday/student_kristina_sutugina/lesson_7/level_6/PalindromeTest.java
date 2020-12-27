package javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_12
@CodeReview(approved = true)
class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.palindromePassedTest();
        palindromeTest.palindromeFailedTest();
    }

    public void palindromePassedTest() {
        String text = "kuuk";
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(text);
        check(result, "palindromePassedTest");
    }

    public void palindromeFailedTest() {
        String text = "kkuk";
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(text);
        check(result, "palindromeFailedTest");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " is passed");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
