package javaguru.sunday.student_liana_shirmane.lesson_12.level_3;
//task21

class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

//Получим оба сообщения
//Got the Test Exception
//Inside finally block