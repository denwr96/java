package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

// lesson_14 task_1
// lesson_14 task_2
// lesson_14 task_3
// lesson_14 task_4
// lesson_14 task_5
// lesson_14 task_6
// lesson_14 task_7
// lesson_14 task_8
// lesson_14 task_9
// lesson_14 task_10
// lesson_14 task_11
// lesson_14 task_12
// lesson_14 task_13
// lesson_14 task_14
// lesson_14 task_15
// lesson_14 task_16
// lesson_14 task_17

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findAllGreenApples(List<Apple> apples){
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if(apple.getColor().equals("green")){
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> findAllRedApples(List<Apple> apples){
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : apples) {
            if(apple.getColor().equals("red")){
                redApples.add(apple);
            }
        }
        return redApples;
    }

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
