public class BlueCollarWorker extends Worker {
    private double salary;

    public BlueCollarWorker() {
    }

    public BlueCollarWorker(String name, String surname, String pesel, int birthYear, int employmentYear, char sex, String company, String occupation, double salary) {
        super(name, surname, pesel, birthYear, employmentYear, sex, company, occupation);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
