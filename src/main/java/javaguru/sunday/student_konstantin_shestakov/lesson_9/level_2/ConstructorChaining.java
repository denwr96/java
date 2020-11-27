package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_2;

// Task 10

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this("Name");
//        this("Name", 6);
//        ConstructorChaining constructorChaining = new ConstructorChaining("Name");
    }
}
