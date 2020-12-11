package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_6.task_17;


class StockTest {

    public static void main(String[] args) {
        Stock greenByte = new Stock("Green Byte", 15.0, 10.0, 25.0);

        String priceInformation = greenByte.getPriceInformation();
        System.out.println(priceInformation);

        greenByte.updatePrice(10.0);
        priceInformation = greenByte.getPriceInformation();

        greenByte.updatePrice(12.0);
        priceInformation = greenByte.getPriceInformation();

        greenByte.updatePrice(5.0);
        priceInformation = greenByte.getPriceInformation();

        greenByte.updatePrice(7.0);
        priceInformation = greenByte.getPriceInformation();

        greenByte.updatePrice(99.0);
        priceInformation = greenByte.getPriceInformation();

        greenByte.updatePrice(77.0);
        priceInformation = greenByte.getPriceInformation();
        System.out.println(priceInformation);

        StockTest greenByteTest = new StockTest();
        greenByteTest.testCaseMax1();
        greenByteTest.testCaseMax2();
        greenByteTest.testCaseMax3();
        greenByteTest.testCaseMax4();
        greenByteTest.testCaseMax5();
    }

    void testCaseMax1(){

        Stock greenByte = new Stock("Green Byte", 15.0, 10.0, 25.0);

        greenByte.updatePrice(999.0);

        String priceInformation = greenByte.getPriceInformation();
        String testResult = "Company name: Green Byte, Current price = 999.0 €, Min price = 10.0 €, Max price = 999.0 €";
        boolean testResultEqualsPriceInformation = testResult.equals(priceInformation);

        System.out.println(priceInformation);

        if (testResultEqualsPriceInformation) {
            System.out.println("1st Test OK");
        }
        else {
            System.out.println("1st Test FAILED");
        }
    }

    void testCaseMax2(){

        Stock greenByte = new Stock("Green Byte", 15.0, 10.0, 25.0);

        greenByte.updatePrice(999.0);
        greenByte.updatePrice(1.0);

        String priceInformation = greenByte.getPriceInformation();
        String testResult = "Company name: Green Byte, Current price = 1.0 €, Min price = 1.0 €, Max price = 999.0 €";
        boolean testResultEqualsPriceInformation = testResult.equals(priceInformation);

        System.out.println(priceInformation);

        if (testResultEqualsPriceInformation){
            System.out.println("2st Test OK");
        }
        else {
            System.out.println("2st Test FAILED");
        }
    }

    void testCaseMax3(){

        Stock greenByte = new Stock("Green Byte", 15.0, 10.0, 25.0);

        greenByte.updatePrice(999.0);
        greenByte.updatePrice(2.0);
        greenByte.updatePrice(1000.0);

        String priceInformation = greenByte.getPriceInformation();
        String testResult = "Company name: Green Byte, Current price = 1000.0 €, Min price = 2.0 €, Max price = 1000.0 €";
        boolean testResultEqualsPriceInformation = testResult.equals(priceInformation);

        System.out.println(priceInformation);

        if (testResultEqualsPriceInformation){
            System.out.println("3st Test OK");
        }
        else {
            System.out.println("3st Test FAILED");
        }
    }

    void testCaseMax4(){

        Stock greenByte = new Stock("Green Byte", 15.0, 10.0, 25.0);

        greenByte.updatePrice(999.0);
        greenByte.updatePrice(2.0);
        greenByte.updatePrice(1000.0);
        greenByte.updatePrice(8.0);

        String priceInformation = greenByte.getPriceInformation();
        String testResult = "Company name: Green Byte, Current price = 8.0 €, Min price = 2.0 €, Max price = 1000.0 €";
        boolean testResultEqualsPriceInformation = testResult.equals(priceInformation);

        System.out.println(priceInformation);

        if (testResultEqualsPriceInformation){
            System.out.println("4st Test OK");
        }
        else {
            System.out.println("4st Test FAILED");
        }
    }

    void testCaseMax5(){

        Stock greenByte = new Stock("Green Byte", 15.0, 10.0, 25.0);

        greenByte.updatePrice(9.0);
        greenByte.updatePrice(27.0);

        String priceInformation = greenByte.getPriceInformation();
        String testResult = "Company name: Green Byte, Current price = 27.0 €, Min price = 9.0 €, Max price = 27.0 €";
        boolean testResultEqualsPriceInformation = testResult.equals(priceInformation);

        System.out.println(priceInformation);

        if (testResultEqualsPriceInformation){
            System.out.println("5st Test OK");
        }
        else {
            System.out.println("5st Test FAILED");
        }
    }
}
