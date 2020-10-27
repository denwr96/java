package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_6;

public class Tree {

    String name ;
    double hight ;
    boolean hasLeafes ;



    public Tree (String name ,double hight , boolean hasLeafes){
        this.name = name;
        this.hight = hight;
        this.hasLeafes = hasLeafes ;
    }

    void growUp(){
        this.hight = ( this.hight+0.5 );
    }

    void fallLeafes(){
        hasLeafes=false;
        System.out.println("No leafes");

    }
}
