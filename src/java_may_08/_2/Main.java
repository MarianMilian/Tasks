package java_may_08._2;

import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",
                2001,
                0012,
                "blue",
                "Michelin ",
                20,
                "eb-11",
                2.0,
                400);

        TreeSet<Car> set = new TreeSet<>();
        set.add(new Car("B",
                1995,
                0012,
                "blue",
                "Michelin ",
                20,
                "eb-11",
                2.0,
                400));
        set.add(new Car("Bmw",
                2003,
                0012,
                "blue",
                "Michelin ",
                20,
                "eb-11",
                2.0,
                400));
        set.add(new Car("KIA",
                2004,
                0012,
                "blue",
                "Michelin ",
                20,
                "eb-11",
                2.0,
                400));


        System.out.println(set);
        System.out.println(set.stream().filter((car -> car.getYear() < 2000)).collect(Collectors.toSet()));
        System.out.println(set.stream().map((car -> {
        if (car.getYear() > 2000) {
            car.getWheel().setRadius(car.getWheel().getRadius() + 1);
            return car;
        }
        return car;})).collect(Collectors.toSet()));
}
}
//    є класс авто
//        поля
//         - модель
//         - рік
//         - номер
//         - колір
//         - Двигун (к)
//         - модель
//         - об'єм
//         - кінські сили
//         - Колесо (к)
//         -виробник
//         -діаметр
//
//
//         Створити колекцію авто яка буде посортивана за роком випуску
//         Пройтись по коллекції, всі автівки які меньше 2000 року
//         змінити радіус колеса на одн меньше від поточного
//         всі автівки які старіше 2000 року пепефарбувати в зелений