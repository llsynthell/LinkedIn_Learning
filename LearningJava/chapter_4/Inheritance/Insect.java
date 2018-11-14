public class Insect {
    int age;
    int numberOfLegs;

    public Insect (int input_Age, int input_numberOfLegs) {
        this.age = input_Age;
        this.numberOfLegs = input_numberOfLegs;
    }

    public void says() {
        System.out.println("...");
    }

    public void crawl() {
        System.out.println("This insect crawled");
    }
}