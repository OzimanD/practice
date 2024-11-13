package ALina.OOP.page121_14;

import java.util.ArrayList;

public class Main implements Interfaace {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Іванов", "Менеджер", 2023, 2024, 25000.00),
                new Employee("Петренко", "Інженер", 2022,  2024, 35000.00),
                new Employee("Коваль", "Програміст", 2021, 2024,  40000.00),
                new Employee("Шевченко", "Дизайнер", 2023,  2024,  22000.00),
                new Employee("Сидоренко", "Аналітик", 2022,  2024, 28000.00)
        };

        Main main = new Main();
        main.employeeList(employees);

    }

    @Override
    public void employeeList(Employee[] employees) {
        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i < employees.length; i++) {
           if (employees[i].getContractStartYear() == 2023){
               list.add(employees[i]);
           }

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());

        }

    }
}
