import java.util.Arrays;
import java.util.stream.Collectors;

public class CommissionWorker extends Worker {

    private double[] monthlySalaries;

    public CommissionWorker() {
    }

    public CommissionWorker(String name, String surname, String pesel, int birthYear, int employmentYear, char sex, String company, String occupation, double[] monthlySalaries) {
        super(name, surname, pesel, birthYear, employmentYear, sex, company, occupation);
        this.monthlySalaries = monthlySalaries;
    }

    public double calculateAverageSalary(){
        return Arrays.stream(monthlySalaries)
                .average()
                .orElse(Double.NaN);
    }

    public double calculateTotalIncome(){
        return Arrays.stream(monthlySalaries)
                .sum();
    }

    public int calculateBiggerSalaries(double value) {
        return (int) Arrays.stream(monthlySalaries)
                .filter(val -> val >= value)
                .count();
    }

    public double[] getMonthlySalaries() {
        return monthlySalaries;
    }

    public void setMonthlySalaries(double[] monthlySalaries) {
        this.monthlySalaries = monthlySalaries;
    }
}
