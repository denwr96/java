package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_2.level_5_middle.task_15;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Очень много лешнего кода ) ")
public class Task15 {

    public static void main(String[] args){
        //Добавляю символ " для печати
        char quotes = (char) 34;

        System.out.println("В Java существует несколько команд для вывода текста в командную строку:\n\nSystem.out.println(" + quotes + "Ваш текст" + quotes + ") - выводит указанный текст на консоль, и переводит курсор на новую строку:");
        System.out.println("System.out.print(" + quotes + "Ваш текст" + quotes + ") - эта команда распечатает текст на консоль и оставит курсор в той же строке.\n");

        System.out.println("Пример вывода следующего двухстрочного кода:\n\nSystem.out.print(" + quotes + "Java" + quotes + ");\nSystem.out.println(" + quotes + "Guru" + quotes + ");\n");
        System.out.println("Результат:\n");
        System.out.print("Java");
        System.out.println("Guru");
        System.out.println();

        System.out.println("Для наглядности дополнительно скомбинируем System.out.print() (курсор остаётся в той же строке) с командой запрашивающей ввод данных от пользователя");
        System.out.print("Введите ваши данные → ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Теперь в комбинации с System.out.println() (курсор переводится на след. строку)");
        System.out.println("↓ введите ваши данные ");
        String text2 = scanner.nextLine();

    }
}
