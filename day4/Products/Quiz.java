package Products;
import java.util.HashMap;
import Enums.MultipleChoice;

public class Quiz {
    
    
    public void askQuestion(){
        System.out.println("How do we feel about Java?");
        
        HashMap<MultipleChoice, String> options = new HashMap<MultipleChoice, String>();
        options.put(MultipleChoice.A, "this is A");
        options.put(MultipleChoice.B, "Love it");
        options.put(MultipleChoice.C, "Awesome");
        options.put(MultipleChoice.D, "Can't get enough");

        System.out.println(options.get(MultipleChoice.A));
    }
}