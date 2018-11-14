import java.awt.*;

public class LambdaMain {
    public static void main(String[] args) {
        Answerable phone = () -> "Hello";
        System.out.println(phone.answer());

        Predicate isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(2));
    }
}