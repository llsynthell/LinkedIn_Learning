import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

import java.util.Scanner;
import java.util.Arrays;

public class ChapterThree {
    public static void main(String[] args) {
        // Decision-making with IFs
        System.out.println("---Decision-making with IFs---");
        System.out.print("Enter an age: ");
        Scanner in = new Scanner(System.in);
        int age =in.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("Baby!");
        } else if (age >= 6 && age <=12) {
            System.out.println("Child!");
        } else if (age >= 13 && age <=17) {
            System.out.println("Teen!");
        } else if (age >=18) {
            System.out.println("Adult!");
        } else {
            System.out.println("Invalid!");
        }

        System.out.println("Thanks for using this program.");

        // Comparing Loops
        System.out.println("---Comparing Loops---");
        // WHILE
        System.out.println("while loop");
        int x = 3;
        while(x > 0) {
            System.out.println("Current x: " + x);
            x -= 1;
        }
        System.out.println("Final x: " + x);
        System.out.println();

        // DO-WHILE
        System.out.println("do-while loop");
        int y = 3;
        do {
            System.out.println("Current y: " + y);
            y -=1;
        } while (y > 0);
        System.out.println("Final y: " + y);
        System.out.println();

        // FOR
        System.out.println("for loop");
        for(int i=3; i>0; i--) {
            System.out.println("Current i: " + i);
        }
        System.out.println("Final i: 0");
        System.out.println();

        // Using libraries for extra functionality
        System.out.println("---Using Libraries for Extra Functionality---");
        double power = Math.pow(5, 3);
        System.out.println("Power(5,3): " + power);

        double squareRoot = Math.sqrt(64);
        System.out.println("Square Root(64): " + squareRoot);

        Random rand = new Random();
        int ranNum = rand.nextInt();
        int ranNumWithBound = rand.nextInt(10);
        System.out.println("Random Number: " + ranNum);
        System.out.println("Random Number with Bound 10: " + ranNumWithBound);
    }
}