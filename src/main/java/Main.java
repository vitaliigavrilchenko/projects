import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {

        DataBaseService dataBaseService = new DataBaseService();
        Book book = new Book();
        book.setName("namename22");
        book.setColour("blackk");
        book.setPages(327);
        book.setAuthor("adrianrr");
        dataBaseService.addBook(book);

    }

}


