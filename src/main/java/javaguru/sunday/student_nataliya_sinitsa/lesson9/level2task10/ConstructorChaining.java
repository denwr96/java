package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level2task10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }


    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }

}
