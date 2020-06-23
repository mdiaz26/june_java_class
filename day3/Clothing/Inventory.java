package Clothing;

public class Inventory {
    private int price;
    private int quantity;

    public Inventory(){

    }
    
    public Inventory(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    
    public Inventory(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int newPrice) {
        if (newPrice > 0){
            this.price = newPrice;
        }
    }

    public int getQuantity(){
        return this.quantity;
    }
    

    public void sellItem(){
        System.out.println("This item has been sold for " + this.price + " dollars");
    }

    @Override
    public String toString(){
        return "This piece of inventory sells for " + this.price + ". We have " + this.quantity + " in stock.";
    }
}