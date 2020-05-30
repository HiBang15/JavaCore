package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
	public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "");
            PreparedStatement stm = con.prepareStatement("select id, full_name, email, pass from tb_user");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("full_name");
                String mail = rs.getString("email");
                String pass = rs.getString("pass");
                
                String msg = String.format("ID: %s, Name: %s, Email: %s, Pass: %s", id, name, mail, pass);
                System.out.println(msg);
            }
        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        	System.out.println(ex.getMessage());
        }
    }
}
