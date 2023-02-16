package task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertListToString {
    /*task1
     * Метод приймає на вхід список імен. Необхідно повернути рядок вигляду
     *  1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)*/
    public static String convertListToStringMethod(List<String> names) {


        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));

    }

    /*task2
     * Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
     * Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).

     */
    public static List<String> convertListToUpperListSortedMethod(List<String> names) {

        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }

    /*task3
    * Є масив: ["1, 2, 0", "4, 5"]
Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,,
* наприклад:  "0, 1, 2, 4, 5"*/
    public static String convertArrayToListSortedNumbersMethod(String[] numbers) {

        return Stream.of(numbers)
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));
    }


    /*task4
    * Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
    Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed,
    * і далі кожний наступний елемент рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.
    Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
    Для тесту використовуйте такі дані:
    a = 25214903917
    c = 11
    m = 2^48 (2в степені48`)*/
    public static Stream<Long> getRandomStream(long a, int c, long m, long seed, int end) {

        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(end);
    }


    /*task5
     * Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
     * який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
     * коли у одного зі стрімів закінчаться елементи.*/

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

//        Iterator<T> secondIterator = second.iterator();
//        return first.flatMap(element->secondIterator
//                .hasNext()?Stream.of(element,secondIterator.next()):Stream.empty());
        List<T> res = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            res.add(iterator1.next());
            res.add(iterator2.next());
        }
        return res.stream();

    }
}









