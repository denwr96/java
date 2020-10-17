package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_24;

class River {
    String riverName;
    int riverLength;
    boolean isClean;

    public River (String riverName){this.riverName = riverName;}
    public River (String riverName, int riverLength){
        this.riverName = riverName;
        this.riverLength = riverLength;
    }
    void information (){System.out.println("River " + riverName + ',' + " River length " + riverLength);}
    void information2 (){isClean = true;}
}