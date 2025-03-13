package by.donin.L2025_03_13;

import by.donin.L2025_02_27.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportUserManager {

    private Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(Transport transport) {
        User user = transport.getUser();
        transportByOwner.putIfAbsent(user, new ArrayList<>());
        List<Transport> userTransport = transportByOwner.get(user);
        userTransport.add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void printAllOwnersAndTransport() {
        //List<User> userList = transportByOwner

        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
