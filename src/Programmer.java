class Programmer extends Employee implements Training {
    public Programmer(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void attendTraining() {
        System.out.println("Programmer " + getName() + " is attending training.");
    }
}