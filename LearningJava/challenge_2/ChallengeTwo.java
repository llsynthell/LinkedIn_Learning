import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class ChallengeTwo {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("Initial: " + d.getFaceUp());
        for(int i=0; i<10; i++) {
            d.roll();
            System.out.println("Rolled: " + d.getFaceUp());
        }
    }

}