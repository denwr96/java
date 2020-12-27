package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_x;

//Super Task1

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilLauncher {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArrayUserInputLength();
        arrayUtil.fillArrayUserInputNumbers();
        arrayUtil.printArrayToConsole();
        arrayUtil.createArrayRandomLength();
        arrayUtil.fillArrayWithRandomNumbers();
        arrayUtil.printArrayToConsole();
        arrayUtil.arrayFindMax();
        arrayUtil.arrayFindMin();
        arrayUtil.arrayFindEven();
        arrayUtil.arrayFindOdd();
    }
}
