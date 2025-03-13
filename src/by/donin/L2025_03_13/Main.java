package by.donin.L2025_03_13;

public class Main {
    public static void main(String[] args) {
        final int capacity = 10;
        TransportManager transportManager = new TransportManager();
        TransportUserManager transportUserManager=  new TransportUserManager();



        for (int i = 0; i < capacity; i++) {
            Transport transport = TransportFactory.getRandomNext();
            transport.setUser(UserFactory.getNext());
            transportUserManager.addTransport(transport);
        }

        transportUserManager.printAllOwnersAndTransport();


    }


}


