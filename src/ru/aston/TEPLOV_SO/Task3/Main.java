package ru.aston.TEPLOV_SO.Task3;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вывести все четные числа в диапазоне от 1 до 100");
        IntStream.range(0, 101)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2");
        Stream.of( 1, 2, 3, 4, 5)
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce()");
        Integer num = Stream.of( 1, 2, 3, 4, 5)
                .reduce((acc, x) -> acc += x)
                .get();
        System.out.println(num + "\n");

        System.out.println("Вывести числа в диапазоне от 1 до 50 с шагом 2");
        IntStream.range(1, 51)
                .filter(x -> x % 2 != 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Найти первый четный элемент в списке [1, 2, 3, 4, 5]");
        num = Stream.of( 1, 2, 3, 4, 5)
                .filter(x -> x % 2 == 0)
                .findFirst()
                .get();
        System.out.println(num + "\n");

        System.out.println("Отсортировать элементы массива [1, 3, 5, 7, 9] по возрастанию");
        Stream.of( 1, 3, 5, 7, 9)
                .sorted()
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Вывести первые 10 чисел в списке [0, 1, 2, … 99]");
        IntStream.range(0, 100)
                .limit(10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Пропустить первые 10 элементов списка [0, 1, 2,.., 99] и начать выводить с 11-го элемента, выводя каждый 10-й элемент");
        IntStream.range(0, 100)
                .skip(11)
                .filter(x -> x % 10 == 1)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Выведите на экран все числа в диапазоне от 1 до 100, которые делятся на 3.");
        IntStream.range(1, 101)
                .filter(x -> x % 3 == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Выведите все нечетные числа в заданном массиве.");
        IntStream.range(1, 101)
                .filter(x -> x % 2 != 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Выведите на экран только те элементы списка, которые больше заданного числа.");
        IntStream.range(1, 101)
                .filter(x -> x > 50)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Отфильтруйте все элементы списка, которые меньше 0.");
        IntStream.range(1, 101)
                .filter(x -> x > 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
    }
}
