package javaguru.sunday.teacher.lesson_6.lessoncode;

public class ForEachExample {

    public static void main(String[] args) {
        int[] myArray = {5, 10, -5, 20, 42};

        for (int number : myArray) {
            System.out.println(number);
        }

        String[] names = {"Alex", "Dima", "Ola"};
        String[] namesUpperCase;
//        for (String name : names) {
//            name = name.toLowerCase();
//        }
        namesUpperCase = new String[names.length];
        for (int i = 0; i < namesUpperCase.length; i++) {
            namesUpperCase[i] = names[i];
        }

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }

        for (String name : names) {
            System.out.println(name);
        }
        for (String name : namesUpperCase) {
            System.out.println(name);
        }
    }
}
