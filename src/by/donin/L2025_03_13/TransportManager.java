package by.donin.L2025_03_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportManager {
    private Map<String, Transport> transportByPlate = new HashMap<>();
    private Map<String, List<Transport>> transportByType = new HashMap<>();


    public void addTransport(Transport transport) {
        transportByPlate.putIfAbsent(transport.getLicensePlate(), transport);

        String type = transport.getClass().getSimpleName();
        transportByType.putIfAbsent(type, new ArrayList<>());
        List<Transport> transports = transportByType.get(type);
        transports.add(transport);
    }

    public void removeTransport(String licensePlate) {
        Transport transport = transportByPlate.remove(licensePlate);
        if (transport != null) {
            String type = transport.getClass().getSimpleName();
            List<Transport> transports = transportByType.get(type);
            System.out.println("Удалили");
        } else {
            System.out.println("Не нашли транспорт с таким номером");
        }
    }

    public void printAllTransport() {
        //List<Transport> transports = transportByPlate.values()
        for (Map.Entry<String, Transport> entry : transportByPlate.entrySet()) {
            //System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }


}
