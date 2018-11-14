import java.util.Random;

public class Coin {

    private final static int HEADS = 0;
    private final static int TAILS = 1;

    private int faceUp;

    public Coin() {
        flip();
    }

    public void flip(){
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }

    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "Heads";
        } else if (faceUp == TAILS) {
            return "Tails";
        } else {
            return "Invalid";
        }
    }
}