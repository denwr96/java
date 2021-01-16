package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
