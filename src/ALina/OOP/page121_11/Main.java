package ALina.OOP.page121_11;

import java.util.ArrayList;

public class Main implements Interface{
    public static void main(String[] args) {
        Product[] products = {
                new Product("Молоко", 2024, 7, 45.50, 1),
                new Product("Хліб", 2024, 3, 20.00, 2),
                new Product("Сир", 2024, 14, 120.75, 3),
                new Product("Яблука", 2024, 10, 30.25, 4),
                new Product("Ковбаса", 2024, 30, 150.00, 5)
        };

        Interface main = new Main();
        main.listOfProducts(products);

    }

    @Override
    public void listOfProducts(Product[] products) {

        ArrayList<Product> productList = new ArrayList<>();

        for (int i = 0; i < products.length; i++) {
           productList.add(products[i]);

        }

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " "+ products[i].getShelfLifeInDays());
        }

    }

}
