package javaguru.sunday.student_deniss_lenenkov.lesson_6.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumTest();
    }

    public void sumTest(){
        TwoDimensionlaArray victim = new TwoDimensionlaArray();
        int[][]array = {{5, 10}, {15, 20}};
        int expectedResult = 40;
        int actualResult = victim.sumArray(array);
        if (expectedResult == actualResult){
            System.out.println("sumTest is OK. ");
        }else{
            System.out.println("sumTest is FAIL. ");
            System.out.println("Expected result: " + expectedResult + ", Actual result: " + actualResult);
        }
    }
}
