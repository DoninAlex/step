package by.donin.L2025_01_23;

public class Product {
    String name;
    int price;
    int quantity;

    public Product() {
        System.out.println("Создали продукт");
    }

    public Product(String productName, int productPrice, int productQuantity) {
        this.name = productName;
        this.price = productPrice;
        this.quantity = productQuantity;
    }

    int getTotalValue() {
        return price * quantity;
    }
}
