package by.donin.L2025_03_10;

import by.donin.L2025_03_03.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportManager {
    private Map<String, Transport> transportByPlate = new HashMap<>();
    private Map<String, List<Transport>> transportByType = new HashMap<>();


    public void addTransport(Transport transport) {
        transportByPlate.putIfAbsent(transport.getLicensePlate(), transport);
    }

    public void printAllTransport() {
        //List<Transport> transports = transportByPlate.values()
        for (Map.Entry<String, Transport> entry : transportByPlate.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
