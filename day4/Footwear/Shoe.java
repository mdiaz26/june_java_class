package Footwear;
import Products.Inventory;

public class Shoe extends Inventory {
    private float size;
    private String material;

    public Shoe(float price, String name, float size, String material) {
        super(price, name);
        this.size = size;
        this.material = material;
    }

    public float getSize(){
        return this.size;
    }

    public void setSize(float newSize){
        this.size = newSize;
    }

    public String clean(){
        return "I took the shoe to a specialist";
    }

    public String repairShoe(float price){
        return "Repair complete. You owe me $" + price/2;
    }

    public String repairShoe(float price1, float price2){
        float total = price1/2 + price2/4;
        return "Repair complete. You owe me $" + total;
    }

    private String treatLeather(){
        return "The leather has been treated";
    }

    private String shineShoe(){
        return "The shoe has been shined";
    }

}