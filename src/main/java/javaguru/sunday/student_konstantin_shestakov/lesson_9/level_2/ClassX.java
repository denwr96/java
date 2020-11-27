package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_2;

// Task 13

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}
