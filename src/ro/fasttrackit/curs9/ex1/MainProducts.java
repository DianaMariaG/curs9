package ro.fasttrackit.curs9.ex1;

public class MainProducts {
    public static void main(String[] args) {
        Electronics fridge1 = new Fridge(1700, "IceBlast37", "upper-class",4, "new", 200, 100, 40, 70, 2 );
        System.out.println(fridge1.getQuantity());
        System.out.println(fridge1.increasePrice() + " RON");

        Fridge fridge2 = new Fridge(1900, "SuperFreeze", "high-speed", 15, "recycled", 230, 125, 50, 80, 4);
        System.out.println(fridge2.decreaseTemp(2));
        System.out.println("The new price is: " + fridge2.increasePrice() + " RON");

        Cosmetics lipstick = new Cosmetics(130, "RedDawn", "metallic effect", 80, "red", 50);
        System.out.println(lipstick.getDescription());
        System.out.println(lipstick.getPrice());
        lipstick.setDescription("More colours are now available");
        System.out.println(lipstick.getDescription());

        Electronics laptop = new Electronics(6000, "MacBook Air", "high functionality",60, "new", 30, 20, 3, 500 );

        Cosmetics perfume = new Cosmetics(300,"BlueLotus", "egyptian scent",45,"blue",250);
        System.out.println(perfume.newPrice(50));
        System.out.println(perfume.getName());
    }
}
