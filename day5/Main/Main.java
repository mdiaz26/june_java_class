package Main;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Main {
    public static int counter = 0;
    public static void main(String[] args){
        Main incrementor = new Main();
        Main incrementor2 = new Main();
        
        // incrementor.incrementCounter();
        // incrementor.incrementCounter();
        // incrementor.incrementCounter();
        // incrementor.incrementCounter();
        // incrementor2.incrementCounter();

        // Arithmetic calculator = new Arithmetic();
        // System.out.println(calculator.divide(21, 0));

        // Concurrent newThread = new Concurrent();
        // String threadName = Thread.currentThread().getName();
        // newThread.run();
        // System.out.println(threadName);

        List<Integer> ourList = new ArrayList<>();
        ourList.add(10);
        ourList.add(12);
        ourList.add(16);
        ourList.add(321);
        System.out.println(ourList);

        // in JS: ourList.filter(num => num < 100)

        List<Integer> filteredList = new ArrayList<>();
        int loopCount = 0;
        for(int i = 0; i < ourList.size(); i++) {
            // if the value at this index fits our criteria, do something
            int currentValue = ourList.get(i);
            if (currentValue < 100) {
                // filteredList.add(currentValue);
                loopCount++;
            }
        }

        System.out.println("Filtered list:" + filteredList);
        System.out.println("Number of elements below 100: " + loopCount);

        List<Integer> streamFilteredList = ourList.stream().filter(num -> num < 100).collect(Collectors.toList());
        // Collection<Integer> streamFilteredList = ourList.stream().filter(num -> num < 100);

        long streamCount = ourList.stream().filter(num -> num < 100).count();

        float streamAverage = ourList.stream().reduce(0, (subtotal, element) -> subtotal + element) / (float)ourList.size();

        System.out.println("Magic!: " + streamFilteredList);
        System.out.println("Magic!: " + streamCount);
        System.out.println("Lee's test: " + streamAverage);


    }

    public void incrementCounter(){
        counter++;
        System.out.println(counter);
    }

}