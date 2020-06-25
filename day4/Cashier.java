public class Cashier implements OperatesRegister{
    public void scanItem(){
        System.out.println("Item scanned!");
    }

    public void processReturn(){
        System.out.println("Sorry it didn't work out");
    }
}