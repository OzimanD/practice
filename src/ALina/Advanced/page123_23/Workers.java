package ALina.Advanced.page123_23;

import java.time.LocalDate;


public class Workers {
    private String surname;
    private String position;
    private LocalDate signedDate;
    private LocalDate expDate;
    private String salary;

    public Workers(String surname, String position, LocalDate signedDate, LocalDate expDate, String salary) {
        this.surname = surname;
        this.position = position;
        this.signedDate = signedDate;
        this.expDate = expDate;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(LocalDate signedDate) {
        this.signedDate = signedDate;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", signedDate=" + signedDate +
                ", expDate=" + expDate +
                ", salary='" + salary + '\'' +
                '}';
    }
}
