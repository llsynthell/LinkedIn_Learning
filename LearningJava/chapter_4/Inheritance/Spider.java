class Spider extends Insect {
    boolean isPoisonous;

    public Spider(int age, boolean input_isPoisonous){
        super(age, 8);
        this.isPoisonous = input_isPoisonous;
    }

    // overwrites the insect.says() function
    public void says() {
        System.out.println("HSSSSS");
    }
}