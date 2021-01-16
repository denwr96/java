package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;
@CodeReview(approved = true)
class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight &&
                color.equals(apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
