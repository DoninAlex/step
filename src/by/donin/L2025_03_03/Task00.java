package by.donin.L2025_03_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();

        stringList.add("Александр");
        stringList.add("Владимир");
        stringList.add("Сергей");
        stringList.add("Николай");

        stringList2.add("Сергей");
        stringList2.add("Николай");
        System.out.println("Размер stringList => " + stringList.size());

        stringList.addAll(stringList2);
        System.out.println("Размер stringList => " + stringList.size());
        System.out.println(stringList);

        //stringList.clear();
        System.out.println("Размер stringList => " + stringList.size());
        System.out.println(stringList);

        boolean isSergeContains = stringList.contains("Сергей");
        System.out.println(isSergeContains);

        boolean isContainsAll = stringList.contains(stringList2);
        System.out.println(isContainsAll);

        if(!stringList.isEmpty()) {
            System.out.println("Не пустой");
        }

        boolean equals = stringList.equals(stringList2);
        System.out.println(equals);

        System.out.println(stringList.get(0));
        System.out.println(stringList.indexOf("Александр")); // 0
        System.out.println(stringList.remove("Сергей"));
        System.out.println(stringList);

        stringList.reversed();
        System.out.println(stringList);

        stringList.set(2, "Василий");
        System.out.println(stringList);

        String[] array = stringList.toArray(new String[0]);
        System.out.println(array);

        List<String> k = new ArrayList<>(20);

        test();

    }

    public static void test() {
//        List<Car> cars = List.of(new Car("Audi", 1988),
//                new Car("BMW", 2005));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 1988));
        cars.add(new Car("BMW", 2005));

        System.out.println(cars);
        for (Car car : cars) {
            if (car.getYear() == 2005) {
                System.out.println(car);
            }
        }

        // Удалим все машины 2005-го года выпуска
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.getYear() == 2005) {
                iterator.remove();
            }
        }
        System.out.println(cars);

    }
}
