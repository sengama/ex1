public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 35, "Manager");
        Programmer programmer = new Programmer("Jane Smith", 25, "Programmer");

        manager.attendTraining();
        programmer.attendTraining();

        Interview interview = manager;
        interview.conductInterview();
    }
}