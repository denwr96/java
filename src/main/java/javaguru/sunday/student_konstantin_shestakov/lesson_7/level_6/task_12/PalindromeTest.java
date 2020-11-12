package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_12;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTest();
    }

    void isPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        checkResults(palindrome.isPalindrome("А роза упала, на лапу Азора."), "Palindrome test");
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
