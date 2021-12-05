package ro.fasttrackit.curs9.ex1;

public class Electronics extends Product {
    protected String type;
    protected int length;
    protected int width;
    protected int height;
    protected int weight;

    public Electronics(int price, String name, String description, int quantity, String type, int length, int width,
                       int height, int weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
