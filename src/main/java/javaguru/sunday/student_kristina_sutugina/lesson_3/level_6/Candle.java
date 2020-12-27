package javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

//Task_24

 class Candle {
    String colour;
    int size;
    String shape;


     Candle(String colour, String shape) {
        this.colour = colour;
        this.shape = shape;
        this.size = 10;
    }

     void candleBurning() {
        this.size = size - 1;
    }

    void printInformation() {
        System.out.println("The candle is " + this.colour + " and its shape is " + this.shape + " and the size is " + this.size + " cm.");
    }
}
