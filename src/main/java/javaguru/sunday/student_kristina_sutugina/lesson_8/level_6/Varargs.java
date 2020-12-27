package javaguru.sunday.student_kristina_sutugina.lesson_8.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//Varargs — или Variable Arguments — это технология,
// которая позволяет создавать методы с произвольным количеством аргументов.
@CodeReview(approved = true)
class Varargs {
    public static void main(String... names) {
        Varargs varargs = new Varargs();
        varargs.print("Kristina, Laura, Alex, John");
    }
    public void print(String...names){
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
