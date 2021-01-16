package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_1_to_2;

class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}
