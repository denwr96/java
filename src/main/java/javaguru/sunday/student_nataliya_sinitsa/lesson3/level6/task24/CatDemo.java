package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CatDemo {

    public static void main(String[] args) {
        Cat myCat = new Cat ("Smoky", true, true);
        myCat.sayYouName();
        myCat.eat();
        myCat.sleep();
    }

}
