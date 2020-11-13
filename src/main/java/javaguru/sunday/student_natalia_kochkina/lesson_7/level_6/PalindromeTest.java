package main.java.javaguru.sunday.student_natalia_kochkina.lesson_7.level_6;

//Task_12

public class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.palindromeTest1();
        palindromeTest.palindromeTest2();
    }

    public void palindromeTest1() {
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome("what?");
        if (!isPalindrome) {
            System.out.println("Palindrome test1 OK");
        } else {
            System.out.println("Palindrome test1 FAILED");
        }
    }

    public void palindromeTest2() {
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome("А роза упала на лапу Азора");
        if (isPalindrome) {
            System.out.println("Palindrome test2 OK");
        } else {
            System.out.println("Palindrome test2 FAILED");
        }
    }
}
