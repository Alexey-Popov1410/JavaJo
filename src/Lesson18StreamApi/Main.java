package Lesson18StreamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 \n" + " Среднее значение : " + average(Arrays.asList(15, 23, 5, 11, 37, 9)));

        List<String> lest1 = Arrays.asList("ejfcnrkav", "pt69ck2g", "5921", "2pvo2v", "trk49dsp30v", "ew9dj1x04lbe");
        long line = lest1.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(" Задание 2 \n" + " Колличество уникальных строк : " + line );

        Map<String, Integer> map = new HashMap<>();
        map.put("test", 3);
        map.put("random", 6);
        map.put("psekfdsie", 2);
        map.put("r02ds", 5);
        map.put("523464064", 8);
        map.put("smile", 7);
        System.out.println(" Задание 3 \n" + " Сумма всех значений : " + sumOfValue(map));

        System.out.println(" Задание 4 \n" + " Результат конкатенации : " + concat(Arrays.asList(3, 8, 5, 1, 7)));

        Person a1 = new Person("Tolia", "Turov", 22);
        Person a2 = new Person("Dima", "Stepanenko", 25);
        Person a3 = new Person("Maria", "Bylda", 30);
        Person a4 = new Person("Aleksandr", "Potapenko", 40);
        System.out.println(" Задание 5 \n" + " Старший по условию : " + getOlderPerson(Arrays.asList(a1, a2, a3, a4)));

    }


    public static double average(List<Integer> list) {
        return list
                .stream()
                .filter(integer -> integer % 5 == 0)
                .filter(integer -> integer % 2 != 0)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }


    public static long sumOfValue(Map<String, Integer> map) {
        return map
                .entrySet()
                .stream()
                .filter(m -> m.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }


    public static String concat(List<Integer> list) {
        return list
                .stream()
                .map(Object::toString)
                .reduce("", (base, element) -> base + element);
    }


    public static String getOlderPerson(List<Person> people) {
        return people.stream()
                .filter(person -> person.getFirstName().length() + person.getLastName().length() < 15)
                .sorted((person1, person2) -> Integer.compare(person2.getAge(), person1.getAge()))
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .findFirst()
                .get();
    }
}
