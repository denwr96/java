package javaguru.sunday.student_deniss_lenenkov.lesson_6.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//task_9
//task_10
//task_11
//task_12
@CodeReview(approved = true)
public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();

        test.specifiedNumberTest(5);
        test.arrayNumberTimesTest(5);
        test.numberToNumberTest();


    }

    static void specifiedNumberTest(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {10, 21, 5};
        boolean expectedResult = true;
        boolean actualResult = victim.specifiedNumber(myArray, number);
        if (expectedResult == actualResult) {
            System.out.println("specifiedNumberTest is OK.");
        } else {
            System.out.println("specifiedNumberTest is FAIL.");
            System.out.println("Expected result: " + expectedResult + " ,Actual result: " + actualResult);
        }
    }

    static void arrayNumberTimesTest(int number) {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = {10, 21, 5};
        int expectedResult = 1;
        int actualResult = victim.arrayNumberTimes(myArray, number);
        if (expectedResult == actualResult) {
            System.out.println("arrayNumberTimesTest is OK.");
        } else {
            System.out.println("arrayNumberTimesTest is FAIL.");
            System.out.println("Expected result: " + expectedResult + " ,Actual result: " + actualResult);
        }
    }

    static void numberToNumberTest() {
        ArrayUtil victim = new ArrayUtil();
        int[] firstArray = {1, 2, 3};
        int[] newArray = {5, 2, 3};
        int expectedResult = newArray[0];
        int actualResult = victim.numberToNumber(firstArray, 1, 5);
        if (expectedResult == actualResult) {
            System.out.println("numberToNumberTest is OK.");
        } else {
            System.out.println("numberToNumberTest is FAIL");
            System.out.println("Expected result: " + expectedResult + " ,Actual result: " + actualResult);
        }
    }


}
