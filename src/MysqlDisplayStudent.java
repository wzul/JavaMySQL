// This is a simple example for STIW2024

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDisplayStudent {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12174999", "sql12174999", "EYX8tM6xxx");
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");

        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
        }

        connection.close();
    }
}