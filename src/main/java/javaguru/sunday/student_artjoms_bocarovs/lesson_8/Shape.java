package javaguru.sunday.student_artjoms_bocarovs.lesson_8;

public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}
