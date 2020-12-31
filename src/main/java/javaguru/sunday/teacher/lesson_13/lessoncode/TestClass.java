package javaguru.sunday.teacher.lesson_13.lessoncode;

public class TestClass {

    public void throwsException() {
        throw new IllegalStateException();
    }

    public void callMethodThatThrowsException() throws Exception {
        TestClass testClass = new TestClass();

        try {
            testClass.throwsException();
        } catch (IllegalStateException e) {
            System.out.println("Something went wrong");
            throw new Exception(e);
        }
    }


    public void callAll() {
        TestClass testClass = new TestClass();

        try {
            testClass.callMethodThatThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
