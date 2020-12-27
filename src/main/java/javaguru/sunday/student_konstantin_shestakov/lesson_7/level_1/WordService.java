package javaguru.sunday.student_konstantin_shestakov.lesson_7.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 1-3
@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        System.out.println(text);
        String[] textArray = text.split("[ ~!@#$%^&*()_+`1234567890-={}:;'|<>,./?]"); // метод из стандартной библиотеки, конвертация String -> String[];
        String repeatWord = checkForRepeatWordsAndCountRepeats(textArray); // метод определяет самое часто повторяющееся слово в массиве и кол-во повторов
        return repeatWord;
    }

    public String checkForRepeatWordsAndCountRepeats(String[] textArray) {
        int counter = 0;
        int counterMax = 0;
        String repeatWord = "N/A";

        for (int i = 0; i < textArray.length; i++) { // сравнение каждого значения массива с каждым
            if (textArray[i].equals("")) {
                continue; // пропуск цикла для regex значений, передавших элементу массива пустое значение
            }
            counter = 1;
            for (int j = i + 1; j < textArray.length; j++) { // определение кол-ва повторений
                if (textArray[i].equals(textArray[j])) {
                    counter++;

                    if (counterMax < counter) {
                        repeatWord = textArray[i];
                        counterMax = counter;
                    }
                }
            }
        }
        System.out.println("Повторяющееся слово = " + repeatWord + ", кол-во повторений = " + counterMax);
        return repeatWord; // можно отдублировать метод для проверки возврата int самого большого кол-ва повторений
    }
}