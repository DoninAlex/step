package by.donin.L2025_03_06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int capacity = 100;
        List<Transport> transportList = new ArrayList<>(capacity);
        TransportFactory transportFactory = new TransportFactory();

        for (int i = 0; i < 9; i++) {
            transportList.add(transportFactory.getRandomNext());
        }

        System.out.println(">>> Создано транспорта: " + transportList.size());
    }
}
