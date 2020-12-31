package java.javaguru.sunday.teacher.lesson_13.lessoncode;

import javaguru.sunday.teacher.lesson_13.lessoncode.TestClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {

    TestClass testClass;

    @Before
    public void setUp() throws Exception {
        testClass = new TestClass();
    }

    @Test(expected = IllegalStateException.class)
    public void throwsException() {
        testClass.throwsException();
    }
}