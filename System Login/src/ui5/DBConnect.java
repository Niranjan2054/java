/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Niranjan
 */
public class DBConnect {

    public static Connection conn;

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "");
            System.out.println("Database Connected Successfully");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Database cannot be connected!");
            System.exit(0);
        }
        return null;
    }
}
