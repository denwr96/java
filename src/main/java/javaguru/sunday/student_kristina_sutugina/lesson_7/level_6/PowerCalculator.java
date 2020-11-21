package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;
//Task_10

class PowerCalculator {

    public int powerCalculator(int number, int power){
        int result = 1;
        for(int i = 0; i<power; i++ ){
            result = result*number;
        }
        return result;
    }
}
