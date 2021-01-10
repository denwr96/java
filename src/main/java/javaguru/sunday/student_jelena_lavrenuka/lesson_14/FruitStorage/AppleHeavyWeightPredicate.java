package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
