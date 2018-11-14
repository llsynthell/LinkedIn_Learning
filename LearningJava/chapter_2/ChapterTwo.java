import java.awt.Color;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChapterTwo {
    public static void main(String[] args) {
        // 2. Java Basics
        System.out.println("---Chapter 2---");
        Car myCar = new Car(25.5, "SYN7H", Color.BLUE, true);
        Car soniaCar = new Car(32.8, "K35TUO", Color.BLACK, true);

        System.out.println("My car's license plate: " + myCar.licensePlate);
        System.out.println("Sonia's car license plate: " + soniaCar.licensePlate);

        myCar.changePaintColor(Color.white);
        System.out.println("My car's color: " + myCar.paintColor);

        String devInput = "Entertainment";
        String upperCase = devInput.toUpperCase();
        System.out.println("devInput: " + devInput);
        System.out.println("upperCase(devInput): " + upperCase);
        System.out.println("Case sensitive contains (enter): " + devInput.contains("enter"));
        System.out.println("Not case sensitive contains (enter): " + devInput.toLowerCase().contains("enter"));

        System.out.print("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        String uIUpperCase = userInput.toUpperCase();
        System.out.println("userInput: " + userInput);
        System.out.println("uIUpperCase: " + uIUpperCase);
        System.out.println("Case sensitive contians (userInput): " + userInput.contains("enter"));
        System.out.println("Not case sensitive contians (userInput): " + userInput.toLowerCase().contains("enter"));

        // 31, 45, 22, 98, 10
        // delaire & allocate an array
        int[] numbers = new int[5];
        // initialize the values
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        // declaire, allocate, initialize data for an array
        int[] numbers2 = { 31, 45, 22, 98, 10 };
        Arrays.sort(numbers);

        // String array example
        String[] myFavoriteCandyBars = { "Twix", "Hershey", "Crunch" };
        System.out.println("myFavoriteCandyBars Index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        System.out.println("myFavoriteCandyBars Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("myFavoriteCandyBars Length: " + myFavoriteCandyBars.length);
        // Array class import
        System.out.println("Array class get function: " + Array.get(myFavoriteCandyBars, 2));
        // Arrays class import
        Arrays.sort(numbers);
        System.out.println("Arrays sort: " + Arrays.toString(numbers));

        // Passing arguments to a function example
        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);

        // using documentation
        String s = "dog";
        String replacedF = s.replace("d", "f");
        System.out.println(replacedF);
    }
}