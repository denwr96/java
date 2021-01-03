package javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_12;

import java.util.Arrays;


class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.removeAllSymbolsTest();
        palindromeTest.putTextToLowerCase();
        palindromeTest.makeCharArrayTest();
        palindromeTest.isPalindromeTest();
        palindromeTest.isPalindromeFailTest();

    }

    public void putTextToLowerCase() {
        Palindrome test = new Palindrome();
        check(test.putTextToLowerCase("HELLO"), "hello", "putTextToLowerCase");
    }

    public void removeAllSymbolsTest() {
        Palindrome test = new Palindrome();
        check(test.removeAllSymbols("!Hello,"), "Hello", "removeAllSymbols");
    }

    public void makeCharArrayTest() {
        Palindrome test = new Palindrome();
        char[] expectedResult = {'h', 'e', 'l', 'l', 'o'};
        check(test.makeCharArray("hello"), expectedResult, "makeCharArrayTest");

    }

    public void isPalindromeTest() {
        Palindrome test = new Palindrome();
        check(test.isPalindrome("А роза упала на лапу Азора"), "isPalindromeTest");
    }

    public void isPalindromeFailTest() {
        Palindrome test = new Palindrome();
        check(!test.isPalindrome("А роза не упала на лапу Азора"), "isPalindromeFailTest");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(char[] actualArray, char[] expectedArray, String testName) {
        if (Arrays.equals(actualArray, expectedArray)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " false!");
        }
    }

}
