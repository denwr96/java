package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_4;

// Task 25

class StackOverflowErrorExample {

    public static void main(String[] args) {
        StackOverflowErrorExample demo = new StackOverflowErrorExample();
        demo.createObject();
    }

    void createObject() {
        StackOverflowErrorExample stackOverflowErrorExample = new StackOverflowErrorExample();
        createObject();
    }
}
