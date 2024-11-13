package ALina.OOP.page120_1;
//описовий клас, клас в якому описані всі поля, конструктори і методи


public class Engeneers {
    private String surname;
    private String name;
    private String fName;
    private String sex;
    private String position;
    private int dateOfBirth;

    public Engeneers(int dateOfBirth, String position, String sex, String fName, String name, String surname) {
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.sex = sex;
        this.fName = fName;
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Engeneers{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
