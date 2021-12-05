package ro.fasttrackit.curs9.ex1;

public class Product {
    protected int price;
    protected String name;
    protected String description;
    protected int quantity;

    public Product(int price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
    public int increasePrice() {
        return this.price + (20*this.price)/100;
    }
}
