import java.util.Arrays;

public class Car {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(args));
        // System.out.println(args);
        System.out.println("Hello Students");

        int primNum = 7;
        // Integer nonPrimNum = primNum;
        if (primNum < 6) {
            System.out.println("yay");
        } else if (primNum == 5){
            System.out.println("meh");
        } else {
            System.out.println("boo");
        }

        String dayOfWeek = "Wednesday";

        switch (dayOfWeek) {
            case "Monday":
                System.out.println("case of the Mondays");
                break;
            case "Tuesday":
                System.out.println("there's no slogan about Tuesday");
                break;
            default:
                System.out.println("a world outside of time");
        }

        short something = 0;
        while (something < 10) {
            if (something == 5) {
                something++;
                continue;
            }
            System.out.println(something);
            something++;
        }

        do {
            System.out.println("inside the do");
        }
        while (something < 0);

        Integer[] array = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int num : array) {
            System.out.println(num);
        }
        // cars.map(auto => console.log(auto))

    }
}