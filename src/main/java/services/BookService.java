package services;

import dao.BookDao;
import model.Book;

public class BookService {

    private BookDao bookDao = new BookDao();

    public Book findById(int id) {
        return bookDao.getBookById(id);
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }
}
