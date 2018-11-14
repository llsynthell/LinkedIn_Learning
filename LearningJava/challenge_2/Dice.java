import java.util.Random;

public class Dice {
    private final static int ONE = 0;
    private final static int TWO = 1;
    private final static int THREE = 2;
    private final static int FOUR = 3;
    private final static int FIVE = 4;
    private final static int SIX = 5;

    private int faceUp;

    public Dice() {
        roll();
    }

    public void roll(){
        Random rand = new Random();
        faceUp = rand.nextInt(6);
    }

    public String getFaceUp() {
        if (faceUp == ONE) {
            return "One";
        } else if (faceUp == TWO) {
            return "Two";
        } else if (faceUp == THREE) {
            return "Three";
        } else if (faceUp == FOUR) {
            return "Four";
        } else if (faceUp == FIVE) {
            return "Five";
        } else if (faceUp == SIX) {
            return "Six";
        } else {
            return "Invalid";
        }
    }
}