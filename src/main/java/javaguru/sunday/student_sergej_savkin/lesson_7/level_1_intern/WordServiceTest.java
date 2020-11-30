package main.java.javaguru.sunday.student_sergej_savkin.lesson_7.level_1_intern;


import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.convertStringToWordArrayTest();
        wordServiceTest.findMostCommonWordTest();

    }

    public void convertStringToWordArrayTest(){
        WordService test = new WordService();
        String[] expectedResult = {"Have", "a", "nice", "day"};
        check(expectedResult, test.convertStringToWordArray("Have a nice day"), "convertStringToWordArrayTest");
    }

    public void findMostCommonWordTest(){
        WordService test = new WordService();
        String expectedResult = "name";
        check(expectedResult, test.findMostCommonWord(test.convertStringToWordArray("Hello! My name name is Sergej")), "findMostCommonWordTest");
    }

    public void check(String expectedResult, String actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(String[] expectedResult, String[] actualResult, String testName){
        if (Arrays.deepEquals(expectedResult, actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}

