import Clothing.*;
import Enums.ShirtSize;
import Footwear.Shoe;
import Products.Inventory;
import java.util.*;
import Products.Quiz;

class Store {
    
    public static void main(String[] args) {
        Shoe ourShoe = new Shoe(39.99f, "Leather Shoe", 10.5f, "leather");
        System.out.println(ourShoe.repairShoe(39.99f, 44.99f));
        Pant ourInventory = new Pant();
        Inventory ourInventory2 = new Pant();

        Shirt ourShirt = new Shirt(12f, "t-shirt", ShirtSize.XL,"blue");
        // ourShirt.getSize();
        Inventory newShirt = new Shirt(17f, "graphic tee", ShirtSize.M, "striped");
        // newShirt.getSize();
        // newShirt.getPrice();
        // System.out.println(newShirt);

        Quiz newQuiz = new Quiz();
        newQuiz.askQuestion();
    }

}