/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    
    Connection c;
    Statement s;
//    String root="root";
//    String password = "ride4respect";
  //  Object stmt2;
    public Database() throws ClassNotFoundException, SQLException
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","aman","aman");
//            s=c.createStatement();
         }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    
}
