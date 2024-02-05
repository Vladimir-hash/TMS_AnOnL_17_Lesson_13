package task1;

import java.util.ArrayList;
import java.util.List;

import java.util.OptionalDouble;
/*
1. Создать коллекцию класса ArrayList наполнить ее элементами
рандомными элементами типа Integer.
С помощью Stream'ов:
- Удалить дубликаты
- Вывести все четные элементы в диапазоне от 7 до 17
(включительно)
- Каждый элемент умножить на 2
- Отсортировать и вывести на экран первых 4 элемента
- Вывести количество элементов в стриме
- Вывести среднее арифметическое всех чисел в стриме
 */

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }

        System.out.println("Original list: " + list);


        List<Integer> newList = list.stream()
                .distinct()
                .filter(i -> i >= 7 && i <= 17 && i % 2 == 0)
                .peek(i -> System.out.print(i + " "))
                .map(i -> i * 2)
                .sorted()
                .limit(4)
                .toList();
        System.out.println("\n" + newList);

        System.out.println("\nNew List: " + newList);
        System.out.println("Current value of elements in stream: " + newList.size());
        System.out.println("average value of numbers in stream: " + newList.stream().mapToDouble(Integer::doubleValue).average().orElse(0));
    }
}
