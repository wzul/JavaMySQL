
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlUpdateRecord {

    static final String DB_URL = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12174999";
    static final String USER = "sql12174999";
    static final String PASSWORD = "EYX8tM6xxx";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement stmt = connection.createStatement();
        String sql = "UPDATE student "
                + "SET name = 'Akmal Fikri' WHERE matric = 55555";

        stmt.executeUpdate(sql);
        System.out.println("Record has been updated");

        stmt.close();
        connection.close();
    }
}
