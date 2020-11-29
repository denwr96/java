package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_7.task_12;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "не пишите выражения в строчку. Все должно находиться на своей строке.")
public class Palindrome {
    boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[:., ]","");
        System.out.println(text);
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
