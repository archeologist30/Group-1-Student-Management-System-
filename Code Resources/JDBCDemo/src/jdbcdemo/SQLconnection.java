
package jdbcdemo;

import java.sql.*;
import com.mysql.jdbc.*;

public class SQLconnection {
    
    
        private static final String url = "jdbc:mysql://localhost:3306/users";
        private static final String username = "root";
        private static final String password = "";
        
        public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(url,username,password);
        }
    
    
    
    
    
    
    
}
