public class Dog {
    private String name;
    private int age;
    private Boolean alive;

    public Dog() {
        name = "Noname";
        age = 0;
        alive = false;
    }

    public Dog(String inputName, int inputAge, Boolean inputLive) {
        name = inputName;
        age = inputAge;
        alive = inputLive;
    }

    public int GetDogYears() {
        return this.age * 7;
    }

    public void Bark() {
        System.out.println(this.name + " barks!");
    }

    public int Speed(int inputSpeed) {
        return inputSpeed += 10;
    }
}