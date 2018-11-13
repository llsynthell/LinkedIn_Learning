public class Challenge{
    public static void main(String[] args) {
        Dog myDog = new Dog("Vincent", 5, true);

        myDog.Bark();
        System.out.println("Vincent's dog age: " + myDog.GetDogYears());
    }
}