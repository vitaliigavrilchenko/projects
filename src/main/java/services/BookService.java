package services;

import dao.BookDao;
import model.Book;

import java.sql.SQLException;

public class BookService {

    private BookDao bookDao = new BookDao();

    public Book findById(int id) throws SQLException, ClassNotFoundException {
        return bookDao.getBookById(id);
    }

    public void addBook(Book book) throws SQLException, ClassNotFoundException{
        bookDao.addBook(book);
    }
}
