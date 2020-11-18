package main.java.javaguru.sunday.student_liana_shirmane.lesson_7.level_1;

import java.util.Arrays;

public class WordService {

    public String[] splitText(String text) {  //разделаем строку на слова и записываем их в массив
        String[] words = text.split("[^a-zA-Z]+");
        Arrays.sort(words);  //складываем слова по алфавиту, в таком случае одинаковые слова будут рядом
        for (int i = 0; i < words.length; i += 1) {
            System.out.println(words[i]);
        }
        return words;
    }

    public String findPopularWordAndCountIt(String[] words) {
        int[] countingArray = new int[words.length];
        int idX = 0;
        int countWord = 0;
        int max = 0;
        for (int i = 0; i < words.length - 1; i++) { //сравниваем соседние слова и если они одинаковые, то
            if (words[i].equals(words[i + 1])) {        //считаем слова
                countWord++;
            } else {
                countingArray[i] = countWord + 1;    // частоту записываем в массив
                if (max < countWord) {      // сравниваем и обновляем максимальное значение
                    max = countWord;
                    idX = i;               //записываем порядковый номер слова
                    countWord = 0;       //обнуляем счетчик и переходим к следующему слову
                }
            }
        }
        return words[idX];
    }



    public String findMostFrequentWord(String text) {
        String[] words = text.split("[^a-zA-Z]+");
        int[] countingArray = new int[words.length];
        int idX = 0;
        int frequency = 0;
        int max = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if(words[i].equals(words[i+1])) {
                frequency++;
            } else {
                countingArray[i] = frequency + 1;
                if (max < frequency) {
                    max = frequency;
                    idX = i;
                    frequency = 0;
                }
            }
        }
        return words[idX];
    }
}








