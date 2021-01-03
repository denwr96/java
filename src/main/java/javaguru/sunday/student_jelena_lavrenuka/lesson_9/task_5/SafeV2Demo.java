package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_5;


class SafeV2Demo {
    public static void main(String[] args) {
        SafeV2 mySafe = new SafeV2(1234, 1000000);
        mySafe.getMoney(1234, 1000);
        mySafe.putMoney(1234);
    }
}
