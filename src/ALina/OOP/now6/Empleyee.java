package ALina.OOP.now6;

public class Empleyee {

private String Surname;
private int year;
private String status;
private double salary;
private String education;

public Empleyee (String education, double salary, String status, int year, String surname) {
    this.education = education;
    this.salary = salary;
    this.status = status;
    this.year = year;
    Surname = surname;
}

public String getSurname() {
    return Surname;
}

public void setSurname(String surname) {
    Surname = surname;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public String getEducation() {
    return education;
}

public void setEducation(String education) {
    this.education = education;
}
}
