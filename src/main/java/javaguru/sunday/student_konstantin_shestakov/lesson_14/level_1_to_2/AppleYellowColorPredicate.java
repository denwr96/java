package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_1_to_2;

class AppleYellowColorPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return "yellow".equals(apple.getColor());
    }
}
