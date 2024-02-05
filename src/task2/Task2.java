package task2;

import java.util.ArrayList;
import java.util.List;

/*
2. Создать коллекцию класса ArrayList со значениями имен всех студентов
 в группе
 С помощью Stream'ов:
 - Вернуть количество людей с вашим именем (вне
 зависимости от верхнего/нижнего регистра букв)
 - Выбрать все имена, начинающиеся на "а" (вне зависимости от
 верхнего/нижнего регистра букв)
 - Отсортировать и вернуть первый элемент коллекции или
 "Empty@, если коллекция пуста
 */

public class Task2 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Vova");
        students.add("vova");
        students.add("vOvA");
        students.add("Irina");
        students.add("Mike");


        System.out.println("Students list: " + students);

        int myName = (int) students.stream()
                .filter(x -> x.equalsIgnoreCase("Vova"))
                .count();


        System.out.println("The number of students with the name Vova: " + myName);

        List<String> namesStartsA = students.stream()
                .filter(x -> x.startsWith("а") || x.startsWith("А"))
                .toList();

        System.out.println("Students with a name on a/A: " + namesStartsA);

        String firstSortedName = students.stream()
                .min(String::compareToIgnoreCase)
                .orElse("Empty@");

        System.out.println("First name in sorted list: " + firstSortedName);
    }
}
