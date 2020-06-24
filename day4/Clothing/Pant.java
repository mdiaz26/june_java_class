package day4.Clothing;
import day4.Products.Inventory;

public class Pant extends Inventory{
    private int numOfPockets;

    public Pant(float price, String name, int numOfPockets) {
        super(price, name);
        this.numOfPockets = numOfPockets;
    }

    public int getNumOfPockets(){
        return this.numOfPockets;
    }

    public void setNumOfPockets(int newNum){
        this.numOfPockets = newNum;
    }

    public void wash(){
        System.out.println("I took the pants to be washed");
    }

    @Override
    public String toString(){
        return "This is a pair of pants with " + numOfPockets + " pockets. " + super.toString();
    }
}