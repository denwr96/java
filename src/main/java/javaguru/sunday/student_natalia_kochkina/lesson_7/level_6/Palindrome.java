package javaguru.sunday.student_natalia_kochkina.lesson_7.level_6;

//Task_12

public class Palindrome {

    boolean isPalindrome(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[^a-zа-я]", "");
        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] != textArray[textArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
