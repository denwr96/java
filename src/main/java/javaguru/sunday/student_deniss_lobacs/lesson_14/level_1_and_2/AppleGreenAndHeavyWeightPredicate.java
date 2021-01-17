package javaguru.sunday.student_deniss_lobacs.lesson_14.level_1_and_2;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
