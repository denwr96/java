package javaguru.sunday.student_kristina_sutugina.lesson_6.level_4;
//Task_16
//нет codeReview
class EndlessCycleWhileBreak {
    public static void main(String[] args) {
        int a = 0;
        while(a<5){
            a++;
            System.out.println(a);
            if(a==3) {
                break;
            }
        }

    }
}
