package ro.fasttrackit.curs9.ex1;

public class Fridge extends Electronics{
    private int temperature;

    public Fridge(int price, String name, String description, int quantity, String type, int length, int width, int height, int weight, int temp) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temp;
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public int increasePrice() {
        return super.increasePrice();
    }

    public int decreaseTemp(int decrement) {
        return this.temperature -= decrement;
    }

}
