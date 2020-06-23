package Clothing;

public class Shirt extends Inventory {
    private String size;
    private String color;

    public Shirt(int price, int quantity, String size, String color) {
        super(price, quantity);
        this.size = size;
        this.color = color;
    }

    public String getSize(){
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    @Override
    public String toString(){
        return "This shirt " + this.size + ". This shirt color is: " + this.color + ". " + super.toString();
    }
}