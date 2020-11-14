package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class IsEvenTest {
    public static void main(String[] args) {
        IsEvenTest test = new IsEvenTest();
        test.isEvenTest();
        test.isEvenTestNew();
    }

    public void isEvenTest() {
        IsEven victim = new IsEven();
        boolean result = victim.isEven(9);
        testResult(result, "isEvenTest");
    }

    public void isEvenTestNew() {
        IsEven victim = new IsEven();
        boolean result = victim.isEvenNew(8);
        testResult(result, "isEvenTestNew");
    }


    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK (number is even)");
        } else {
            System.out.println(testName + " is FAILED (number is odd)");
        }
    }
}
