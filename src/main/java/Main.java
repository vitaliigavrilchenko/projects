import model.Book;
import services.BookService;

public class Main {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        Book book = new Book();
        book.setName("paparoach");
        book.setColour("green");
        book.setPages(3271);
        book.setAuthor("julVern");
        bookService.addBook(book);

    }

}


