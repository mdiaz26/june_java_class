package Clothing;

public class Pant extends Inventory {
    private int numOfPockets;

    public Pant(int price, int quantity, int numOfPockets) {
        super(price, quantity);
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