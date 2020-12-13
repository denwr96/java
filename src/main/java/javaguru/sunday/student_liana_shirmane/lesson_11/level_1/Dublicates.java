package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_1;
//task4

import java.util.ArrayList;

//Коллекции, реализующие интерфейс java. util. List<E> могут хранить 1,2
// и более копий одного и того же объекта (ссылки на объект).

public class Dublicates {
    public static void main(String[] args) {
        Dublicates duplicates = new Dublicates();
        duplicates.DuplicatesInTheList();
    }

    public void DuplicatesInTheList() {
        ArrayList<Integer> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(26557187);
        phoneNumbers.add(28822202);
        phoneNumbers.add(27423251);
        phoneNumbers.add(26557187);

        for (Integer i : phoneNumbers) {
            System.out.println(i);
        }

    }

}

