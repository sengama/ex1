class Manager extends Employee implements Training, Interview {
    public Manager(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    public void attendTraining() {
        System.out.println("Manager " + getName() + " is attending training.");
    }

    @Override
    public void conductInterview() {
        System.out.println("Manager " + getName() + " is conducting an interview.");
    }
}