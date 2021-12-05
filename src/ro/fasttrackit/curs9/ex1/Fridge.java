package ro.fasttrackit.curs9.ex1;

public class Fridge extends Electronics{
    private int temperature;

    public Fridge(int price, String name, String description, int quantity, String type, int length, int width, int height, int weight, int temp) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temp;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int increasePrice() {
        return this.price + (20*this.price)/100 + 20;
    }


    public int decreaseTemp(int decrement) {
        return this.temperature -= decrement;
    }

}
