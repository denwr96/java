package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level3.task13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class GlassBottle extends Bottle {

    boolean weHaveBottleOpener;
    boolean weHaveStopper;

    public GlassBottle(String material, double volume, String colour, boolean isOpen, boolean isFull) {
        super(volume, colour, isOpen, isFull);
        this.material = "glass";
    }

    @Override
    void openBottle() {
        if (weHaveBottleOpener) {
            isOpen = true;
        }
    }

    @Override
    void closeBottle() {
        if (weHaveStopper) {
            isOpen = false;
        }
    }

}
