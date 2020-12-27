package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe mySafe = new Safe(1234, 1000000);
        mySafe.pinCode = 4321;
        mySafe.moneyAmount = 0;
    }
}
