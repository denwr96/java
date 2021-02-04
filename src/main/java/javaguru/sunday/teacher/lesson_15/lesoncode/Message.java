package javaguru.sunday.teacher.lesson_15.lesoncode;

public class Message {

    public static int instancesCreated = 0;

    private String text;

    public Message(String text) {
        this.text = text;
        System.out.println("Creating message = '" + text + "'");
        instancesCreated++;
    }

    public static int getInstancesCreated() {
        return instancesCreated;
    }
}
