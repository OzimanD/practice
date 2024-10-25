package ALina.OOP.lesson3_page113_task10;

public class main {
    public static void main(String[] args) {


    Books book1 = new Books("Skanavi",400,10, 1985);
    Books book2 = new Books("Yoffy",300,1, 1995);
    Books book3 = new Books("Patty",100,4, 2004);
    Books book4 = new Books("Burgis",200,12, 2020);
    Books book5 = new Books("Traisy",150,13, 1999);

    Books[] books = {book1,book2,book3,book4,book5};
    pagesOver150(books);
    }

    static void pagesOver150 (Books[] books){
        for (int i = 0; i < books.length; i++) {
                if(books[i].getPages()>150){
            System.out.println(books[i].getAuthor());

        }
    }
}
}
