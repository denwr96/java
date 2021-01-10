package javaguru.sunday.teacher.lesson_15.lesoncode;

public class MessageDemo {

    public static void main(String[] args) {
        System.out.println("Created = " + Message.instancesCreated);
        Message greeting = new Message("Hi!");
        Message question = new Message("How are you?");
        Message farewell = new Message("Goodbye!");
        System.out.println("Created = " + Message.instancesCreated);

        System.out.println(Message.getInstancesCreated());

    }
}
