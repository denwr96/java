package javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_6;

//Consumer - встроенный функциональный интерфейс.Принимает значение в качестве аргумента и ничего не возвращает.
// Самый частый случай использования этого интерфейса - это вывод на консоль.
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}