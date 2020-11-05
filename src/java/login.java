
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author playgrnd
 */
public class login 
{
    static final String DB_URL = "jdbc:mysql://localhost:3306/login";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "sonasty";
    
    public static void main(String[] args)
    {     
        Connection conn = null;
        
        try
        {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            
            if(conn != null)
            {
                System.out.println("connected to database successfully");
            }
        }catch(Exception e)
        {
            System.out.println("no connected to DB");
        }
    }
}
