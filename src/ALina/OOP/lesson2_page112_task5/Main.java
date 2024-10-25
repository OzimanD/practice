package ALina.OOP.lesson2_page112_task5;

//Определить общую стоимость всех
//товаров, выпущенных в текущем
//году и вывести сведения об этих
//товарах.

public class Main {
    public static void main(String[] args) {
     Costs costs1 = new Costs(12.5,6,2020, "ABC1", "A1");
     Costs costs2 = new Costs(2.5,6,2024, "ABC2", "A2");
     Costs costs3 = new Costs(1.5,6,2024, "ABC3", "A3");
     Costs costs4 = new Costs(14,6,2023, "ABC4", "A4");
     Costs costs5 = new Costs(8.5,6,2021, "ABC5", "A5");

    Costs[] costsArray = {costs1,costs2,costs3,costs4,costs5};

    calculateCosts(costsArray, 2024);
    }

    public static void calculateCosts (Costs[] costsArray, int year) {
//        int count = 0;
        System.out.println("Товари, випущені у " + year + " році:");

        double itemCosts = 0;

        for (int i = 0; i < costsArray.length ; i++) {
            if(costsArray[i].getYearOfIssue() == year){
               itemCosts += costsArray[i].getPrice();
                System.out.println(costsArray[i]);
            }

        }
        System.out.println(itemCosts);
    }
}
