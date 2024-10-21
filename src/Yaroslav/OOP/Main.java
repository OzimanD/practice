package Yaroslav.OOP;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 1, 999.99, "Dell", "2024-10-21 10:00:00");
        Product product2 = new Product("Smartphone", 25, 699.99, "Samsung", "2024-10-21 11:30:00");
        Product product3 = new Product("Headphones", 2, 49.99, "Sony", "2024-10-21 12:15:00");
        Product product4 = new Product("Tablet", 2, 299.99, "Apple", "2024-10-20 09:45:00");
        Product product5 = new Product("Smartwatch", 30, 199.99, "Huawei", "2024-10-19 08:00:00");
        Product product6 = new Product("Monitor", 3, 159.99, "LG", "2024-10-18 14:10:00");
        Product product7 = new Product("Keyboard", 40, 29.99, "Logitech", "2024-10-17 13:55:00");
        Product product8 = new Product("Mouse", 5, 19.99, "Razer", "2024-10-16 10:30:00");
        Product product9 = new Product("Camera", 2, 499.99, "Canon", "2024-10-15 16:45:00");
        Product product10 = new Product("Printer", 1, 129.99, "HP", "2024-10-14 18:20:00");

        Product[] productList = {
                product1, product2, product3, product4,
                product5, product6, product7, product8,
                product9, product10
        };

        findSomeProducts(productList, 5);

    }

    static void findSomeProducts(Product[] productList, int wantedQuantity) {

        for(Product product : productList){

            if (product.getQuantity() > wantedQuantity){
                System.out.println(product);
            }
        }

    }
}
