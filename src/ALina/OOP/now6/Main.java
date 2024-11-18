package ALina.OOP.now6;

public class Main implements MyInterface {
//String education, double salary, String status, int year, String surname
    public static void main(String[] args) {

        Empleyee empleyee1 = new Empleyee("phd1", 3000, "teacher", 1990, "Alfa1");
        Empleyee empleyee2 = new Empleyee("phd2", 3030, "teacher", 1950, "Alfa2");
        Empleyee empleyee3 = new Empleyee("phd3", 30200, "teacher", 1960, "Alfa3");
        Empleyee empleyee4 = new Empleyee("phd4", 3400, "teacher", 1970, "Alfa4");
        Empleyee empleyee5 = new Empleyee("phd5", 3005, "teacher", 19560, "Alfa5");


        Empleyee[] empleyees = {empleyee1, empleyee2, empleyee3, empleyee4, empleyee5};



    }




    @Override
    public int Over60(Empleyee[] empleyee) {
    int count = 0;

        for (int i = 0; i <empleyee.length ; i++) {
            if(empleyee[i].getYear()<1964){
                count++;
            }
        }
        return count;
    }

    @Override
    public Empleyee infoEmployee(Empleyee[] empleyee) {
        return null;
    }
}
