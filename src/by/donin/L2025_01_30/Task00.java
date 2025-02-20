package by.donin.L2025_01_30;

public class Task00 {
    public static void main(String[] args) {
        /*Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel("Зимняя", 18, "Резина");
        }
        Car audi = new Car("Audi", "TT", 2000, wheels);
        System.out.println(audi);*/

        WheelArray wheelArray = new WheelArray(4);
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        System.out.println(wheelArray);
        wheelArray.add(new Wheel("Зимняя", 18, "Резина"));
        System.out.println(wheelArray);
        wheelArray.add(new Wheel("Летняя", 16, "Резина"));
        System.out.println(wheelArray);
        Wheel wheel = wheelArray.get(wheelArray.size - 1);
        System.out.println(wheel);
        wheelArray.sortByDiameter();
        System.out.println(wheelArray);
        wheelArray.sortByType();
        System.out.println(wheelArray);
        System.out.println("Size: " + wheelArray.getSize());

    }
}
