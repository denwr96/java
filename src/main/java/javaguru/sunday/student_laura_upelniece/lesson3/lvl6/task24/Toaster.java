package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task24;


import java.util.Timer;
import java.util.TimerTask;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;

public class Toaster {
    int secondsToWait;
    boolean switchOn;

    public static void printSeconds() {
        System.out.println("...please wait, toast is cooking...");
    }
//
//    //    public Toaster() {
//        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//
//        executorService.scheduleAtFixedRate(Toaster::printSeconds, 0, delayInSeconds, TimeUnit.SECONDS);
//
//    }


    public void givenUsingTimer_whenSchedulingTaskOnce_thenCorrect() {
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Task performed on: " + "n" +
                        "Thread's name: " + Thread.currentThread().getName());
            }
        };
        Timer timer = new Timer("Timer");

            }







}
