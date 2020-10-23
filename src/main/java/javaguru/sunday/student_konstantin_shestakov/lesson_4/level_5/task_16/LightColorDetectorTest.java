package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorTest2();
        lightColorDetectorTest.lightColorDetectorTest3();
        lightColorDetectorTest.lightColorDetectorTest4();
        lightColorDetectorTest.lightColorDetectorTest5();
        lightColorDetectorTest.lightColorDetectorTest6();
        lightColorDetectorTest.lightColorDetectorTest7();
    }

    public void lightColorDetectorTest() {

        // опциональные перменные для изменения цвета текста
        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(380);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }

    public void lightColorDetectorTest2() {

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(450);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }

    public void lightColorDetectorTest3() {

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(495);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }

    public void lightColorDetectorTest4() {

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(570);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }

    public void lightColorDetectorTest5() {

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(590);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }

    public void lightColorDetectorTest6() {

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(620);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }

    public void lightColorDetectorTest7() {

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(751);

        if (color == "Violet") {
            System.out.println(violetColorText + "Violet test = OK" + blackColorText);
        } else  {
            System.out.println("Violet test = FAIL");
        }
        if (color == "Blue"){
            System.out.println(blueColorText + "Blue test = OK" + blackColorText);
        } else {
            System.out.println("Blue test = FAIL");
        }
        if (color == "Green"){
            System.out.println(greenColorText + "Green test = OK" + blackColorText);
        } else {
            System.out.println("Green test = FAIL");
        }
        if (color == "Yellow"){
            System.out.println(yellowColorText + "Yellow test = OK" + blackColorText);
        } else {
            System.out.println("Yellow test = FAIL");
        }
        if (color == "Orange"){
            System.out.println(yellowColorText + "Orange test = OK" + blackColorText);
        } else {
            System.out.println("Orange test = FAIL");
        }
        if (color == "Red"){
            System.out.println(redColorText + "Red test = OK" + blackColorText);
        } else {
            System.out.println("Red test = FAIL");
        }
        if (color == "Invisible Light"){
            System.out.println(whiteColorText + blackColorBackground +"Invisible test = OK" + whiteColorBackground + blackColorText);
        } else {
            System.out.println("Invisible test = FAIL\n");
        }
    }
}
