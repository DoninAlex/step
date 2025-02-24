package by.donin.L2025_02_24;

public class Cash implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " наличными");
    }
}
