package javaguru.sunday.student_deniss_lenenkov.lesson_5.level_5_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Метод shouldCreateArray ничего не тестирует. Вы создаете переменную arrayLength, а потом проверяете её на > 0 - если правда, то тест пройден =) Надо поправить")
public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }
    public static void shouldCreateArray(){
        ArrayUtil myArray = new ArrayUtil();
        int arrayLength = 3;
        myArray.createArray(arrayLength);
        if(arrayLength > 0){
            System.out.println("shouldCreateArray Test is: " + "OK");
        }else{
            System.out.println("shouldCreateArray Test is: " + "FAIL");
        }
    }
    public static void shouldFillArrayWithRandomNumbers(){
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = victim.createArray(4);
        victim.fillArrayWithRandomNumbers(myArray);
        for(int i = 0; i < myArray.length; i++){
            check(myArray[i] == myArray[i] , "shouldFillArrayWithRandomNumbers");
        }
    }

    public static void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = victim.createArray(4);
        victim.fillArrayWithRandomNumbers(array);
        int maxNumber = victim.findMaxNumber(array);
        for(int i = 0; i < array.length;
        i++){
            check(maxNumber >= array[i], "shouldFindMaxNUmber");
        }
    }

    public static void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = victim.createArray(4);
        victim.fillArrayWithRandomNumbers(array);
        int minNumber = victim.findMinNumber(array);
        for(int i = 0; i < array.length;
            i++){
            check(minNumber <= array[i], "shouldFindMinNUmber");
        }
    }

    public static void check(boolean condition, String testName){
        if(condition){
            System.out.println(testName + ": OK");
        }else{
            System.out.println(testName + ": FAIL");
        }
    }

}
