package ro.fasttrackit.curs9.ex1;

public class Cosmetics extends Product {
    private String colour;
    private int weight;

    public Cosmetics(int price, String name, String description, int quantity, String colour, int weight) {
        super(price, name, description, quantity);
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public int newPrice(int supplement) {
        return super.getPrice() + supplement;
    }

}
