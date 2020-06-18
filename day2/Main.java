package day2;

// import sun.awt.image.ShortInterleavedRaster;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        float variable = 1.5f;
        short ourShort = 100;
        int ourInt = 500;
        long outLong = 1000000000000L;
        double ourDouble = 1.58374623;
        boolean ourBool = true;
        Character ourChar = 'a';
        byte myByte = 25;
        System.out.println(variable);

        // Control Flow
        // if /else
        // for
        // for-each vs .forEach
        // for (car : cars) {
        //     System.out.println("I want to buy this " + car);
        // }
        // .forEach is a Lambda function
        // cars.forEach(car -> {
        //     System.out.println(car);
        // })
        // do-while
        // switch
        // while loop
        // while (statement = true) {
        //     i++;
        //     if (i == 100) {
        //         statement = false;
        //     }
        // }

        // int[][] arrayOfInts = { 
        //     { 32, 87, 3, 589 },
        //     { 12, 1076, 2000, 8 },
        //     { 622, 127, 77, 955 }
        // };

        // search:
        //     for (i = 0; i < arrayOfInts.length; i++) {
        //         for (j = 0; j < arrayOfInts[i]; j++) {
        //             if (arrayOfInts[i][j] == searchfor) {
        //                 foundIt = true;
        //                 break search;
        //         }
        //     }

        String[] myArray = { "one", "two", "three"};
        // const myArray = ["one", 2, "three"]
        

        ArrayList<Integer> ourArrayList = new ArrayList<>();
        ourArrayList.add(10);
        ourArrayList.add(100);
        System.out.println(ourArrayList);
        
        Vector<String> ourVector = new Vector<>(4, 16);
        ourVector.add("hi");
        ourVector.add("hi");
        ourVector.add("hi");
        ourVector.add("hi");
        ourVector.add("hi");
        System.out.println(ourVector.capacity());
        
        // psuedocode
        // [
        //     {index: 0, value: 1, pointer: 100},
        //     {index 100: value: 10, pointer: 1},
        //     {index: 1, value 100, pointer: null}
        // ]

        LinkedList<Float> ourLinkedList = new LinkedList<>();
        ourLinkedList.add(1.5f);
        ourLinkedList.remove(1.5f);

        HashSet<Character> ourHashSet = new HashSet<>();
        ourHashSet.add('e');
        System.out.println("Our Hash Set: " + ourHashSet);
        ourHashSet.add('e');
        ourHashSet.add('f');
        System.out.println("Our Hash Set: " + ourHashSet);

        HashMap<String, Integer> ourHashMap = new HashMap<>();
        ourHashMap.put("Students", 4);
        ourHashMap.put("grades", 100);
        System.out.println(ourHashMap);

        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        myHashMap.put(2,2);
        myHashMap.put(3,5);
        myHashMap.put(18,2);
        myHashMap.put(21,13);
        myHashMap.put(200,2);

        for (int i = 0; i < myHashMap.size(); i++) {
            
            System.out.println(myHashMap.get(i));
        }
    }
}