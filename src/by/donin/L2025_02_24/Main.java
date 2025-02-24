package by.donin.L2025_02_24;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1234567812, "DoninAlex");
        PayPal payPal = new PayPal("donin@mail.ru");
        Cash cash = new Cash();
        PaymentMethod[] paymentMethods = {creditCard, payPal, cash};

        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(150);
        }

    }
}
