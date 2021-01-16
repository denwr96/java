package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_1_to_2;

class AppleHeavyWeightPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
