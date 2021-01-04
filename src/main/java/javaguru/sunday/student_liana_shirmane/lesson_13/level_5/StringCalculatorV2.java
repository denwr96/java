package javaguru.sunday.student_liana_shirmane.lesson_13.level_5;
//task26
//task27
//task28
//task29
//task30
//task31

import java.util.Arrays;
import java.util.stream.Stream;


public class StringCalculatorV2 {

    static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            delimiter = parts[0].substring(2);
            numbers = parts[1];
        }

        Stream<String> numbersSum = Arrays.stream(numbers.split(delimiter));
        return numbersSum.mapToInt(Integer::parseInt).sum();
        }
    }

