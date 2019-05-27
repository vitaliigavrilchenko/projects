import java.sql.*;

public class DataBaseService {

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema?useSSL=false", "root", "");
        return connection;
    }


    public void addBook(Book book) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();

        String query = "insert into book (pages, author, colour, name) values (" + book.getPages()
                + ", \"" + book.getAuthor()
                + "\", \"" + book.getColour()
                + "\", \"" + book.getName() + "\")";

        System.out.println(query);

        statement.executeUpdate(query);

        statement.close();
        connection.close();
    }

    public Book getBookById(int id) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();

        String query = "select * from book where id =" + id;
        ResultSet resultSet = statement.executeQuery(query);
        Book book = new Book();
        if (resultSet.next()) {

            book.setPages(resultSet.getInt("pages"));
            book.setAuthor(resultSet.getString("author"));
            book.setColour(resultSet.getString("colour"));
            book.setName(resultSet.getString("name"));
        }

        statement.close();
        connection.close();
        return book;
    }


}
