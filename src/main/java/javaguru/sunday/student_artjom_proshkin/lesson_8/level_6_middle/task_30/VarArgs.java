package javaguru.sunday.student_artjom_proshkin.lesson_8.level_6_middle.task_30;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class VarArgs {

    void print (String... words){
        for (String word : words) {
            System.out.println(word);
        }
    }

}
