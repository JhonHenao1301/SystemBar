/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/** 
 * @author Jhon Henao
 */
public class Conexion {
    Connection con;
    
    public Conexion() {
        
    if(con != null)
    {
        return;
    }
        
    String url = "jdbc:postgresql://localhost:5432/BarSystem";
    String password = "jhonhenao96";
    
    try{
        Class.forName("org.postgresql.Driver"); 
        con = DriverManager.getConnection(url,"postgres",password);       
        } 
          catch(Exception e){ System.out.println("Problemas de conexion"); }
    
    }   
    
    public Connection getConnection(){
        return con;
    }
    
}
