package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_6;

public class Table {

    String material ;
    double price ;
    boolean isFolding ;

    public Table( String material , double price , boolean isFolding){
        this.material = material;
        this.price = price;
        this.isFolding = isFolding;
    }

    public void buyIt(){
        if (material == "wooden" && price < 7 && isFolding ){
            System.out.println("I buy it");
        }else{
            System.out.println("I do not buy it");
        }
    }
}


