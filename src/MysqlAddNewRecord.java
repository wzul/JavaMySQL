
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlAddNewRecord {

    static final String DB_URL = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12174999";
    static final String USER = "sql12174999";
    static final String PASSWORD = "EYX8tM6xxx";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement stmt = connection.createStatement();

        String sql = "INSERT INTO student "
                + "VALUES ('55555', 'Ali Bakar', 'ali@gmail.com')";
        stmt.executeUpdate(sql);
        System.out.println("Record inserted");

        stmt.close();
        connection.close();
    }
}
