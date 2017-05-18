
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDisplayTableInfo {

    static final String DB_URL = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12174999";
    static final String USER = "sql12174999";
    static final String PASSWORD = "EYX8tM6xxx";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        Statement stmt = connection.createStatement();

        String sql = "select * from student";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();

        int noColumns = rsmd.getColumnCount();
        for (int i = 1; i <= noColumns; i++) {
            System.out.println(rsmd.getColumnName(i) + "\t" + rsmd.getColumnTypeName(i));
        }

        rs.close();
        stmt.close();
        connection.close();
    }
}
