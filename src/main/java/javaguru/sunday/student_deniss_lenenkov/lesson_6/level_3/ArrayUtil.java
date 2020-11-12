package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_6.level_3;
//task_9
//task_10
//task_11
//task_12

public class ArrayUtil {

    public boolean specifiedNumber(int[] myArray, int number){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == number){
                return true;
            }
        }
        return false;
    }

    public int arrayNumberTimes(int[] myArray, int number){
        int times = 0;
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] == number){
                times++;
            }
        }
        return times;
    }

    public int numberToNumber(int[] myArray, int firstNumber, int newNumber){
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] == firstNumber){
                myArray[i] = newNumber;
            }
        }
        return newNumber;
    }


}
