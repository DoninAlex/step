package by.donin.L2025_02_24;

import java.util.Objects;

public class PayPal implements PaymentMethod, Cloneable{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " через PayPal аккаунт " + email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PayPal payPal = (PayPal) o;
        return Objects.equals(email, payPal.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return "PayPal аккаунт " + email;
    }

    @Override
    public PayPal clone() {
        try {
            PayPal clone = (PayPal) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
