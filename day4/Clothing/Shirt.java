package Clothing;
import Products.Inventory;
import Enums.ShirtSize;

public class Shirt extends Inventory {
    private ShirtSize size;
    private String color;

    public Shirt(){}

    public Shirt(float price, String name, ShirtSize size, String color) {
        super(price, name);
        this.size = size;
        this.color = color;
    }

    public ShirtSize getSize(){
        return this.size;
    }

    public void setSize(ShirtSize size) {
        this.size = size;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String clean(){
        return "I put the shirt in the washing machine";
    }

    @Override
    public String toString(){
        return "This shirt " + this.size + ". This shirt color is: " + this.color + ". " + super.toString();
    }
}