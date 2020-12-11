package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_12;


import java.util.Arrays;

class Palindrome {

    boolean isPalindrome(String text) {
        boolean isPalindrome = true;
        System.out.println("Text: \n" + text);

        text = text.toLowerCase();
        System.out.println("Text, lower case: \n" + text);

        text = text.replaceAll("[\\s+.,\"=;-]","");
        System.out.println("Text, remove symbols: \n" + text);

        char[] charArray = text.toCharArray();
        System.out.println("Text converted to char: \n" + Arrays.toString(charArray));

        for (int i = 0; i < charArray.length ; i++) {

            if(charArray[i] != (charArray[charArray.length - 1 - i])) {
                isPalindrome = false;
                System.out.println(charArray[i] + " <-> " + charArray[charArray.length - 1 - i] + ", palindrome: " + isPalindrome);
            }
        }
        return isPalindrome;
    }
}
