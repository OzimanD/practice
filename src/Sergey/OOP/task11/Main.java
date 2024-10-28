package Sergey.OOP.task11;

//вывести данные о книгах, тираж
//которых не превышает 10000
//экземпляров

public class Main implements BooksInter{

    @Override
    public void arr_books(Books[] books) {

        for (int i = 0; i < books.length; i++) {
            if(books[i].getTiraj()>10000){
                System.out.println(books[i]);
            }
        }
    }

    public static void main(String[] args) {
        Books books1 = new Books("Conan1","fantastic1","Pira1",5000);
        Books books2 = new Books("Conan2","fantastic2","Pirat2",20000);
        Books books3 = new Books("Conan3","fantastic3","Pirat3",18000);
        Books books4 = new Books("Conan4","fantastic4","Pirat4",13000);
        Books books5 = new Books("Conan5","fantastic5","Pirat5",7800);

        Books[] arr_books = {books1,books2,books3,books4,books5};

        BooksInter help = new Main();
        help.arr_books(arr_books);

        }

        public static void Hello(){
            System.out.println("Hello");
        }
}
