/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.billing.system;

import java.sql.*;
/**
 *
 * @author Sumit Mehra
 */
public class Conn 
{
    Connection c;
    Statement s;
    Conn()
    {
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","root");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
}
