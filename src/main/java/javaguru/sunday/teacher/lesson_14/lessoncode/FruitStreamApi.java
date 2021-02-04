package javaguru.sunday.teacher.lesson_14.lessoncode;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FruitStreamApi {

	private List<Fruit> fruits = new ArrayList<>();

	public FruitStreamApi() {
		fruits.add(new Fruit("apple", "red", 50));
		fruits.add(new Fruit("apple", "green", 200));
		fruits.add(new Fruit("pear", "red", 150));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 150));
		fruits.add(new Fruit("apple", "red", 100));
		fruits.add(new Fruit("apple", "green", 200));
		fruits.add(new Fruit("pear", "red", 50));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 300));
		fruits.add(new Fruit("tomato", "black", 300));
	}

	public List<Fruit> getAllFruits() {
		return fruits;
	}

	public List<Fruit> findAllApples() {
		return fruits.stream()
//				.filter(x -> 10 - x = 5)
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.collect(toList());
	}

	public List<Fruit> findAllApplesV2() {
		return fruits.stream()
				.filter(new Predicate<Fruit>() {
					@Override
					public boolean test(Fruit arg1) {
						return "apple".equals(arg1.getTitle());
					}
				})
				.collect(toList());
	}

	public List<Fruit> findAllApplesV3() {
		Predicate<Fruit> predicate = new Predicate<>() {
			@Override
			public boolean test(Fruit fruit) {
				return "apple".equals(fruit.getTitle());
			}
		};

		return fruits.stream()
				.filter(predicate)
				.collect(toList());
	}


	class GetAllApplesPredicate implements Predicate<Fruit> {

		@Override
		public boolean test(Fruit fruit) {
			return "apple".equals(fruit.getTitle());
		}
	}

	public List<Fruit> findAllApplesV4() {
		return fruits.stream()
				.filter(new GetAllApplesPredicate())
				.collect(toList());
	}


	public List<Fruit> findRedApplesWithWeightBiggerThen100() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.filter(fruit -> "red".equals(fruit.getColor()))
				.filter(fruit -> fruit.getWeight() > 100)
				.collect(toList());
	}

	public Set<String> findAllFruitUniqNames() {
		return fruits.stream()
//					 .map(fruit -> fruit.getTitle())
					 .map(Fruit::getTitle)
					 .collect(Collectors.toSet());
	}

	public Set<Integer> findAllFruitUniqWeight() {
		return fruits.stream()
					 .map(Fruit::getWeight)
					 .collect(Collectors.toSet());
	}

	public List<String> findAllFruitUniqueNames() {
		return fruits.stream()
				.map(Fruit::getTitle)
				//.map(fruit -> fruit.getTitle())
				.distinct()
				.collect(toList());
	}

	public Optional<Fruit> findAnyApple() {
		return fruits.stream()
					 .filter(fruit -> "apple".equals(fruit.getTitle()))
					 .findAny();
	}

	public Optional<Fruit> findFirstApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.findFirst();
	}

	public Map<Integer, List<Fruit>> getAllFruitsByWeight() {
		return fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getWeight));
	}

	public List<String> getAllFruitColors() {
		Map<Integer, List<Fruit>> allFruitsByWeight = getAllFruitsByWeight();

		Set<Map.Entry<Integer, List<Fruit>>> entries = allFruitsByWeight.entrySet();

//		Stream<Map.Entry<Integer, List<Fruit>>> stream = entries.stream();

		return entries.stream()
				.map(Map.Entry::getValue)
				.flatMap(Collection::stream)
				.map(Fruit::getColor)
				.distinct()
				.collect(toList());
	}


}
