package by.donin.L2025_03_10;

import by.donin.L2025_03_06.Transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int capacity = 100;
        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(TransportFactory.getRandomNext());



    }


}


