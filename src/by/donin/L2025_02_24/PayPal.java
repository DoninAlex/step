package by.donin.L2025_02_24;

public class PayPal implements PaymentMethod{
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
}
