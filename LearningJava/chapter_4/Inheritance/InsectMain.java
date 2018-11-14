import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class InsectMain {
    public static void main(String[] args) {
        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2, 1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        if( spider instanceof Spider && spider instanceof Insect){
            System.out.println("Spider is an insect and spider.");
        }
    }
}