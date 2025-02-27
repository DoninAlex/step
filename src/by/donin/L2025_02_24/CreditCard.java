package by.donin.L2025_02_24;

import java.util.Objects;

public class CreditCard implements PaymentMethod, Cloneable{
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber && Objects.equals(cardHolder, that.cardHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardHolder);
    }

    @Override
    public String toString() {
        return "Кредитная карта " + cardNumber + ", владелец " + cardHolder;
    }

    @Override
    public CreditCard clone() {
        try {
            CreditCard clone = (CreditCard) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
