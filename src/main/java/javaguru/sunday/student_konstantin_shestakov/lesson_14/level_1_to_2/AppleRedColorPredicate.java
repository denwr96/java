package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_1_to_2;

class AppleRedColorPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
