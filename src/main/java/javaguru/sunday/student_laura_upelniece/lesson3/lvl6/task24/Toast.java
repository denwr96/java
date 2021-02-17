package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task24;
import java.util.Timer;
import java.util.TimerTask;


public class Toast {

    static boolean powerOn = false;
    static boolean yesOrNo;
    Timer timer;

    int time;
    //boolean powerOn = false;
    int[] heatLevel = new int[4];



    public Toast(boolean answer) {
        this.yesOrNo = answer;


        if(answer == true){
            System.out.println("Turn on the toaster!");
        } else {
            System.out.println("You wrong. Toast is good");
        }


         //this.time = seconds;

//
//        timer = new Timer();
//        //timer.schedule(new RemindTask(), seconds * 1000);
//
//        timer = new Timer();
//        timer.schedule(new SecondsToGo10(), seconds * 1000);
//        timer = new Timer();
//        timer.schedule(new SecondsToGo5(), seconds * 500);
//        timer = new Timer();
//        timer.schedule(new SecondsToGo3(), seconds * 300);

    }

//    class RemindTask extends TimerTask {
//        public void run() {
//            System.out.println("Time's up!");
//            timer.cancel(); //Terminate the timer thread
//        }
//    }

    class SecondsToGo3 extends TimerTask {
        public void run() {
            System.out.println("3 seconds to go!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    class SecondsToGo5 extends TimerTask {
        public void run() {
            System.out.println("5 seconds to go!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    class SecondsToGo10 extends TimerTask {
        public void run() {
            System.out.println("10 seconds to go!");
            timer.cancel(); //Terminate the timer thread
        }
    }




}