package main.java.javaguru.sunday.student_natalia_kochkina.lesson_6.level_4;

//Task_15

public class infinity {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int j = array.length;
        for (int i = 0; i < j; i++)
            while (array[i] > 0) {
                array[i] = array[i] + 1;
                j = j++;
                i = i++;
                System.out.println(array[i]);
            }
    }
}
