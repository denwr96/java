package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_4;
//Task_16
class EndlessCycleForBreak {
    public static void main(String[] args) {
        int a=0;
        for( ; ; ){
            a++;
            System.out.println(a);
            if(a==3) {
                break;
            }
        }
    }
}
