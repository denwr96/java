package javaguru.sunday.student_jelena_lavrenuka.lesson_15.QuadraticEq;

import javaguru.sunday.teacher.annotations.CodeReview;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.D;

// lesson_15 task_4
// lesson_15 task_5
// lesson_15 task_6
// lesson_15 task_7
// lesson_15 task_8
@CodeReview(approved = true)
class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantGreaterThanZero(a, b, D);
        }
        else if (discriminant == 0) {
            return discriminantEqualsZero(a, b);
        }
        else {
            return discriminantLessThanZero();
        }
    }

    private String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantLessThanZero() {
        return "Equation has no roots";
    }

}
