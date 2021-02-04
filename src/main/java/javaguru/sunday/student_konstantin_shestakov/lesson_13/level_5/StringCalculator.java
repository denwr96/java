package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StringCalculator {

    int add(String numbers) {
        numbers = numbers.replaceAll("[^0-9]", "");
        String[] numbersArray = numbers.split("");
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {

            if(numbersArray[i].isEmpty()) {
                numbersArray[i] = "0";
            }
            sum = sum + Integer.parseInt(numbersArray[i]);
        }
        return sum;
    }

    int addV2(String numbers) {
        String[] numbersArray = numbers.split("\\\\n");
        String delimiters = numbersArray[0].replaceAll("[\\[\\]\\/]", "");
        String[] delimitersArray = delimiters.split("");

        String numbersString = numbersArray[1];
        for (int i = 0; i < delimitersArray.length; i++) {
            numbersString = numbersString.replace(delimitersArray[i], "|");
        }
        String[] numbersArrayForCount = numbersString.split("\\|");
        int sum = 0;

        for (int i = 0; i < numbersArrayForCount.length; i++) {

            if(numbersArrayForCount[i].isEmpty()) {
                numbersArrayForCount[i] = "0";
            }
            sum = sum + Integer.parseInt(numbersArrayForCount[i]);
        }
        return sum;
    }

}
