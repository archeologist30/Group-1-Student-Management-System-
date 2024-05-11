
package jdbcdemo;

import java.sql.*;
import com.mysql.jdbc.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class JDBCDemo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GIVE ME UR CREDENTIALS");
        String username = input.nextLine();
        String password = input.nextLine();
        
        
        
        Connection con;
        try {
            con = SQLconnection.getConnection();
            
            PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
            
            pst.setString(1, username);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
                System.out.println("Ok ur gucci Mr. "+ username);
                
            } else{
                System.out.println("NOPE, no "+username+" here");
            }
            
            rs.close();
            pst.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        }
      
    
}
