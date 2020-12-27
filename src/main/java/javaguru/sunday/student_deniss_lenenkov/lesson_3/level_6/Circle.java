package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы чуть-чуть не поняли идеяю ООП. У нас есть класс Круг. Этот класс, помогает нам создавать круги с разными значениями радиуса" +
        "мы должны проинициализировать это значение через конструктор, и все. Далее, у круга должен быть метод, который бы мог взять состояние объекта (радиус) " +
        "и посчитать его площадь. Этот метод должен называться соответствующим образом, чтобы я сразу понял, что я получу при вызове этого метода. К примеру calculateArea()" +
        "Сейчас, ваша программа сразу при инициализации пишет в консоль значение своей площади. А если я этого не хочу? хочу просто создать круг и посчитать его площадь позже?")
public class Circle {

    double radius;

        Circle(double radius){
        this.radius = radius;
        int x = 2;
        System.out.println("Circle radius: " + Math.PI * Math.pow(radius, x));
    }

}
