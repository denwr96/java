package main.java.javaguru.sunday.student_liana_shirmane.lesson_10.level_3;
//task6
//A functional interface is an interface that contains only one abstract method.
// They can have only one functionality to exhibit.

interface FunctionalInterface {

    public static void main(String args[])
    {
        // create anonymous inner class object
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}

