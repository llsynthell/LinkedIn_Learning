 class Cricket extends Insect {
    double length;

    public Cricket(int age, double input_length) {
        super(age, 6);
        this.length = input_length;
    }

    public void says() {
        System.out.println("Chirp");
    }

    public void jump() {
        System.out.println("Cricket jumped!");
    }
}