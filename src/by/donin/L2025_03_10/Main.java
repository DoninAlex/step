package by.donin.L2025_03_10;

import by.donin.L2025_03_06.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int capacity = 100;
        TransportManager transportManager = new TransportManager();

        for (int i = 0; i < 20; i++) {
            transportManager.addTransport(TransportFactory.getRandomNext());
        }

        transportManager.printAllTransport();

        System.out.println();
        System.out.println(Integer.compare(12,10)); // Сравнение
        Integer num15 = Integer.parseInt("15");
        Boolean aTrue = Boolean.TRUE;
        System.out.println(num15);
    }


}


