package javaguru.sunday.student_deniss_lobacs.lesson_12.level_4_junior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        while (true)
            list.add(random.nextInt());

    }
}


