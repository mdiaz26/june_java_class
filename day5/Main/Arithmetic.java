package Main;

public class Arithmetic {
    
    public int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Java is cool");
        }
        System.out.println("calculation complete");
        return num1 / num2;
        
        // try {
        //     // System.out.println("calculation complete");
        //     return num1 / num2;
        // }
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){
        //     System.out.println("Exception: " + exception.getMessage());
        //     System.out.println("calculation complete");
        //     return 0;
        // }
        
    }
}