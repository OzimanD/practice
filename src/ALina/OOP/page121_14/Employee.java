package ALina.OOP.page121_14;

public class Employee {
    private String lastName;
    private String position;
    private int contractStartYear;
    private int contractEndYear;
    private double salary;

    public Employee(String lastName, String position, int contractStartYear, int contractEndYear, double salary) {
        this.lastName = lastName;
        this.position = position;
        this.contractStartYear = contractStartYear;
        this.contractEndYear = contractEndYear;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getContractStartYear() {
        return contractStartYear;
    }

    public void setContractStartYear(int contractStartYear) {
        this.contractStartYear = contractStartYear;
    }

    public int getContractEndYear() {
        return contractEndYear;
    }

    public void setContractEndYear(int contractEndYear) {
        this.contractEndYear = contractEndYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", contractStartYear=" + contractStartYear +
                ", contractEndYear=" + contractEndYear +
                ", salary=" + salary +
                '}';
    }
}
