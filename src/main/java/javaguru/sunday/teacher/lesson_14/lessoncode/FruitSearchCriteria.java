package javaguru.sunday.teacher.lesson_14.lessoncode;

@FunctionalInterface
public interface FruitSearchCriteria {

    boolean test(Fruit fruit);

}

class FindAllApplesCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }
}

class FindAllPearsCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "pear".equals(fruit.getTitle());
    }
}

class FindAllTomatosCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "tomato".equals(fruit.getTitle());
    }
}

class FindAllRedTomatosBiggerThan100Criteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "tomato".equals(fruit.getTitle()) &&
                "red".equals(fruit.getColor()) &&
                fruit.getWeight() > 100;
    }
}