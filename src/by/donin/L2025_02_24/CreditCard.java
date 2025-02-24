package by.donin.L2025_02_24;

public class CreditCard implements PaymentMethod{
    private long cardNumber;
    private String cardHolder;

    public CreditCard(long cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " с кредитной карты " + cardNumber + " владельца " + cardHolder);
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
}
