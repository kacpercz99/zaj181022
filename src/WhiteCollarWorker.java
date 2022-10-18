public class WhiteCollarWorker extends Worker {
    private double wage;
    private double workingHours;

    public WhiteCollarWorker() {
    }

    public WhiteCollarWorker(String name, String surname, String pesel, int birthYear, int employmentYear, char sex, String company, String occupation, double wage, double workingHours) {
        super(name, surname, pesel, birthYear, employmentYear, sex, company, occupation);
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public double calculatePayment() {
        return workingHours * wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
