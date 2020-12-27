package javaguru.sunday.student_natalia_kochkina.lesson_7.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_1
//Task_2
//Task_3
@CodeReview(approved = true)
public class WordService {

    //пишем метод для преобразования текста в массив слов
    public String[] splitTheArray(String text) {
        String[] arrayOfStrings = text.split(",\\s|\\s|\\.|\\.\\s|!\\s|\\?\\s|\\s-\\s|\\$");
        return arrayOfStrings;
    }

    //определяем количество повторений каждого слова, записываем их в массив
    public int[] numberOfRepeats(String[] arrayOfWords) {
        int[] numberOfRepeats = new int[arrayOfWords.length];
        for (int i = 0; i < numberOfRepeats.length; i++) {
            for (int j = 0; j < numberOfRepeats.length; j++) {
                if (arrayOfWords[i].equals(arrayOfWords[j])) {
                    numberOfRepeats[i] = numberOfRepeats[i] + 1;
                }
            }
        }
        return numberOfRepeats;
    }

    //в массиве с количеством повторений находим наибольшее значение,
    //сохраняем его итератор, находим слово с таким же итератором в массиве слов.
    public String theMostRepeatedWord(String[] arrayOfWords, int[] numberOfRepeats) {
        int maxI = 0;
        for (int i = 0; i < numberOfRepeats.length; i++) {
            if (numberOfRepeats[i] > numberOfRepeats[maxI]) {
                maxI = i;
            }
        }
        return arrayOfWords[maxI];
    }

    //Task_3, собираем всё в один метод для решения задачи
    public String findTheMostRepeatedWord(String text) {
        String[] arrayOfWords = text.split(",\\s|\\s|\\.|\\.\\s|!\\s|\\?\\s|\\s-\\s|\\$");

        int[] numberOfRepeats = new int[arrayOfWords.length];
        for (int i = 0; i < numberOfRepeats.length; i++) {
            for (int j = 0; j < numberOfRepeats.length; j++) {
                if (arrayOfWords[i].equals(arrayOfWords[j])) {
                    numberOfRepeats[i] = numberOfRepeats[i] + 1;
                }
            }
        }

        int maxI = 0;
        for (int i = 0; i < numberOfRepeats.length; i++) {
            if (numberOfRepeats[i] > numberOfRepeats[maxI]) {
                maxI = i;
            }
        }
        return arrayOfWords[maxI];
    }
}
