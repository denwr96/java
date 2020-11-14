package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_1;

import java.util.Scanner;

class WordService {
    public String getText(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your text");
        String textFromUser = myScanner.nextLine();
        return textFromUser;
    }

    public String[] splitText(String textFromUser) {
        String[] text;
        String delimeter = " ";
        text = textFromUser.split(delimeter);
        return text;
    }

    public String findMostFrequentWord(String[] text) {
        String wordMaxTimes = "";
        int counterGeneral = 0;
        for (int i = 0; i < text.length; i++) {
            int counter = 0;
            for (int j = 0; j < text.length; j++) {
                if (text[i].equals(text[j]))
                    counter++;
            }
            if (counterGeneral < counter) {
                wordMaxTimes = text[i];
                counterGeneral = counter;
            }
        } if(wordMaxTimes == text[0] && counterGeneral == 1){
            System.out.println("The text is unique (there are no repeat words in the text)");
        } else {
        System.out.println("Word " + '"' + wordMaxTimes + '"' + " occurs in the text most times " + '(' + counterGeneral + " times" + ')');
        }
        return wordMaxTimes;
    }
}


