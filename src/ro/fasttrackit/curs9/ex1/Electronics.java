package ro.fasttrackit.curs9.ex1;

public class Electronics extends Product {
    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;

    public Electronics(int price, String name, String description, int quantity, String type, int length, int width,
                       int height, int weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }
    public String getType() {
        return this.type;
    }
    public int getLength() {
        return this.length;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }
}
