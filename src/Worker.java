import java.time.LocalDate;

public class Worker {
    private String name;
    private String surname;
    private String pesel;
    private int birthYear;
    private int employmentYear;
    private char sex;
    private String company;
    private String occupation;

    public Worker() {

    }

    public Worker(String name, String surname, String pesel, int birthYear, int employmentYear, char sex, String company, String occupation) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.birthYear = birthYear;
        this.employmentYear = employmentYear;
        this.sex = sex;
        this.company = company;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", birthYear=" + birthYear +
                ", employmentYear=" + employmentYear +
                ", sex=" + sex +
                ", company='" + company + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public int calculateJobSeniority() {
        return LocalDate.now().getYear() - employmentYear;
    }

    public int calculateTimeToRetirement() {
        int age = LocalDate.now().getYear() - birthYear;
        if(sex == 'm') {
            return 65 - age;
        }
        return 60 - age;
    }

    public void display() {
        System.out.printf("""
                Name: %s
                Surname: %s
                PESEL: %s
                Birth year: %d
                Employment year: %d
                Sex: %c
                Company: %s
                Occupation: %s
                """,name,surname,pesel,birthYear,employmentYear,sex,company,occupation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
