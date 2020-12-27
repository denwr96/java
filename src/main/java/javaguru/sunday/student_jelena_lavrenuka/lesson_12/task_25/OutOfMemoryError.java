package javaguru.sunday.student_jelena_lavrenuka.lesson_12.task_25;

import java.util.LinkedList;
import java.util.List;

class OutOfMemoryError {
    static final List<Object[]> arrays = new LinkedList<>();

    public static void grabAllMemory() {
        for (; ; ) {
            arrays.add(new Object[100]);
        }
    }
}
