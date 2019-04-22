/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Cliente;
import Modelos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControlCliente {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Cliente cliente = new Cliente();
    Object[] Datos= new Object[3];
    
    public ControlCliente(){
    }
    
    public void agregar()
    {    
    /*Se le asigna a un string el insert en la base de datos*/
        
         String sqlUsuario="INSERT INTO Cliente VALUES" 
                 + "("+cliente.getId()+",'"+ cliente.getNombre()+"','"
                 + cliente.getApellido()+"');";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn = con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sqlUsuario); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Object[] getDatos() {
        return Datos;
    }
    
    
}
    

