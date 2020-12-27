package javaguru.sunday.student_nataliya_sinitsa.lesson8.level3.task13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PlasticBottle extends Bottle {

    public PlasticBottle(String material, double volume, String colour, boolean isOpen, boolean isFull) {
        super(volume, colour, isOpen, isFull);
        this.material = "plastic";
    }

    @Override
    void openBottle() {
        isOpen = true;
    }

    @Override
    void closeBottle() {
        isOpen = false;
    }


}
