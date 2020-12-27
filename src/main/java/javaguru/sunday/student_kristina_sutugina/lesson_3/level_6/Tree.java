package javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

//Task_24

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Tree {
    public String species;
    public boolean conifer;
    public int longevity;

    Tree(String species, int longevity) {
        this.species = species;
        this.longevity = longevity;
    }

    void isConifer() {

        this.conifer = true;
    }
}
