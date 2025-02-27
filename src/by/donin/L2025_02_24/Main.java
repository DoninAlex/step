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

        System.out.println();
        PayPal payPal1 = new PayPal("donin@mail.ru");
        PayPal payPal2 = new PayPal("doin@mail.ru");
        System.out.println("payPal1.equals(payPal2) > " + payPal1.equals(payPal2));
        System.out.println("payPal1 == payPal2 > " + (payPal1 == payPal2));
        PayPal payPal3 = payPal1.clone();
        System.out.println("payPal1.equals(payPal3) > " + payPal1.equals(payPal3));
        System.out.println("payPal1 == payPal3 > " + (payPal1 == payPal3));
        System.out.println("payPal1.hashCode() > " + payPal1.hashCode());
        System.out.println("payPal2.hashCode() > " + payPal2.hashCode());
        System.out.println("payPal3.hashCode() > " + payPal3.hashCode());

        System.out.println();
        CreditCard creditCard1 = new CreditCard(1234567812, "DoninAlex");
        CreditCard creditCard2 = new CreditCard(123457812, "DoninAlex");
        System.out.println("creditCard1.equals(creditCard2) > " + creditCard1.equals(creditCard2));
        CreditCard creditCard3 = creditCard1.clone();
        System.out.println("creditCard1.equals(creditCard3) > " + creditCard1.equals(creditCard3));
        System.out.println("creditCard1.hashCode() > " + creditCard1.hashCode());
        System.out.println("creditCard2.hashCode() > " + creditCard2.hashCode());
        System.out.println("creditCard3.hashCode() > " + creditCard3.hashCode());

    }
}
