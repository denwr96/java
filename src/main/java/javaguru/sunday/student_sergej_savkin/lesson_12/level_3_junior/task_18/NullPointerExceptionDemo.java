package javaguru.sunday.student_sergej_savkin.lesson_12.level_3_junior.task_18;

class NullPointerExceptionDemo {

    Integer num;

    public static void main(String[] args) {
        NullPointerExceptionDemo nullPointerExceptionDemo = new NullPointerExceptionDemo();
        nullPointerExceptionDemo.plusFive(nullPointerExceptionDemo.num);

    }

    public void plusFive(Integer num) {
        int newInt = num + 5;
    }

}
