package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;

import java.util.Arrays;

//Task_12
class Palindrome {
    boolean isPalindrome(String text) {
        char[] array = text.toCharArray();
        char[] copyOfArray = Arrays.copyOf(array, array.length);
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        if (Arrays.equals(array, copyOfArray)) {
            return true;
        }
        return false;
    }
}
