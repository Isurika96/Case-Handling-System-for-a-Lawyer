/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseHandlingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isurika
 */
public class db{
    
//public static Connection con() //sqllite
//    {
//Connection abc=null;
//
//    
//    try {
//        Class.forName("org.sqlite.JDBC");
//        abc=DriverManager.getConnection(("jdbc:sqlite:datab.sqlite"));
//    } catch (Exception ex) {
//        
//    }
//           
//return  abc;
//
//}

public static Connection con()  //xammp
{
    
    Connection abc=null;
    
    try {
        abc=DriverManager.getConnection("jdbc:mysql://localhost:3306/lawyer1","root","");
    } catch (SQLException ex) {
        Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return  abc;
    


}




    
    



} 

