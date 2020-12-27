package javaguru.sunday.student_liana_shirmane.lesson_7.level_6;
//task13


import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Arrays;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Хорошо, только читать чуть-чуть сложно." +
        "Можно было дать понятные названия. j = resultArraySize")
public class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int j = 0;
        for (int i = 0; i < in.length; i++) {
           if (in[i] >= numberFrom && in[i] <= numberTo ) {
               j++;
           }
        }
        int[] array = new int[j];
        j=0;
        for (int i = 0; i < in.length; i++){
            if  (in[i] >= numberFrom && in[i] <= numberTo ){
                array[j] = in[i];
                j++;
            }
        }
        return array;
    }
}
