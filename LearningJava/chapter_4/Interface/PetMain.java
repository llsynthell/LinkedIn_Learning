import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class PetMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        if (c instanceof _Pet) {
            c.play();
        }
        if (d instanceof _Pet) {
            d.play();
        }

        _Pet p;
        Random r = new Random();
        int n = r.nextInt(2);

        if(n == 0) {
            p = new Dog();
        } else {
            p = new Cat();
        }

        p.play();
    }
}