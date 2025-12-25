package dao;

import java.sql.*;
import db.DBConnection;

public class BookDAO {
    public static void viewBooks() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("title") + " " +
                    rs.getString("author") + " " +
                    rs.getInt("quantity")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
