package javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_6;

class Greeting {
    public static void main(String[] args) {
        Consumer greeting = x -> System.out.println("Hello "+ x +" !");
        greeting.accept("Kristina");
    }
}
