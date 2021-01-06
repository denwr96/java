package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
