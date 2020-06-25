package Products;

public abstract class Inventory {
    private float price;
    private String name;

    public Inventory(){}

    public Inventory (float price, String name){
        this.price = price;
        this.name = name;
    }

    public void sellItem(){
        System.out.println("The " + this.name + "has been sold.");
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public abstract String clean();
    

    @Override
    public String toString(){
        return "This " + this.name + " sells for " + this.price + ".";
    }
}