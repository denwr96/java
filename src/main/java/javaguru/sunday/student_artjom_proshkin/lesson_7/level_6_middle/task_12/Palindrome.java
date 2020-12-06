package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Palindrome {

    boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[.,! ?\'-]","");
        System.out.println(text);
        int i = 0;
        int j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return  true;
    }
}
