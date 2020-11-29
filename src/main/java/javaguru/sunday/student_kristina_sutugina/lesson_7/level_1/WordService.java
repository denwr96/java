package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_1
@CodeReview(approved = true)
class WordService {
    public static void main(String...strings) {
        String text = "Paris Paris that my in the the spring.Not that is related.Why are you laughing? Are   my my regular expressions THAT bad??";
        WordService wordService = new WordService();
        System.out.println(  wordService.countOfWords(split(text)));
        System.out.println(  wordService.findMostFrequentWord(text));
    }

    public static String [] split(String text){
        String []words = text.split("\\s+");
        return words;
    }
    public static String countOfWords(String[] words){
        int []countOfWords = new int[words.length];
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(words[i].equals(words[j])){
                    countOfWords[i]= countOfWords[i]+1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < countOfWords.length; i++) {
            if (countOfWords[count] < countOfWords[i]) {
                count = i;
            }
            if(words[count].equals(words[count]+1)){
                return words[count];
            }
        }

        return words[count];
    }
    public String findMostFrequentWord(String text) {
        WordService wordService = new WordService();
        String frequentWord =  wordService.countOfWords(split(text));
        return frequentWord;
    }
}
