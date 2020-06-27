package Main;

public class Concurrent extends Arithmetic implements Runnable {
    public String name = "Kathleen";
    
    public void run(){
        System.out.println("Our new thread is named " + this.name);
    }
}