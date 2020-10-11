package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_24;

class PersonalComputer {
    String computerName;
    int computerLoadingTime;
    int ramVolume;

    PersonalComputer(String computerName, int computerLoadingTime, int ramVolume){
        this.computerName = computerName;
        this.computerLoadingTime = computerLoadingTime;
        this.ramVolume = ramVolume;
    }
    public void pcLoad(){
        System.out.println("PC " + computerName + " has " + ramVolume + " GB of RAM and it is loading in " + computerLoadingTime + " seconds");
    }
    public void ramChange(){
        System.out.println("PC " + computerName + " RAM is changed to " + ramVolume * 2 + " GB of RAM and it is loading in " + computerLoadingTime/2 + " seconds");
    }
}
