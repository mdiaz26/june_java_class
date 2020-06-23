package Main;
import Clothing.Inventory;
import Clothing.Pant;
import Clothing.Shirt;
// import Clothing.*;

class Main {
    public static void main(String[] args){
        Inventory pants = new Inventory(30, 10);
        Inventory suit = new Inventory(300, 10);
        // pants.sellItem();
        // suit.sellItem();
        // pants.setPrice(100);
        // System.out.println(pants.getPrice());
        // System.out.println(pants.toString());
        Pant inheritedPant = new Pant(40, 100, 5);
        // inheritedPant.setPrice(35);
        // System.out.println(inheritedPant.getPrice());
        System.out.println(inheritedPant.toString());

        Shirt ourShirt = new Shirt(35, 1000, "M", "white");
        System.out.println(ourShirt.toString());

    }
}