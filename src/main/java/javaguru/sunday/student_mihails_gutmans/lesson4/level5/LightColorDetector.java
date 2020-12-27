package javaguru.sunday.student_mihails_gutmans.lesson4.level5;

class LightColorDetector {


    public String colorDetector (int waveLenght){
        if (waveLenght >=380 && waveLenght<=449){
            return "Violet";
        }
        if (waveLenght >=450 && waveLenght<=494){
            return "Blue";
        }
        if (waveLenght >=495 && waveLenght<=569){
            return "Green";
        }
        if (waveLenght >=570 && waveLenght<=589){
            return "Yellow";
        }
        if (waveLenght >=590 && waveLenght<=619){
            return "Orange";
        }
        if (waveLenght >=620 && waveLenght<=750){
            return "Red";
        }else{
            return "Invisible light";
        }
    }
}
