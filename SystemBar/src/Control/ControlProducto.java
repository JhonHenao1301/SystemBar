/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelos.Conexion;
import Modelos.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jhon Henao
 */
public class ControlProducto {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    Producto producto = new Producto();
    Object[] Datos= new Object[6]; 
    
    public ControlProducto(){
    }
    
    public void agregar()
    {    
    /*Se le asigna a un string el insert en la base de datos*/
        
         String sqlUsuario="INSERT INTO Producto VALUES" 
                 + "("+producto.getCodigo()+",'"+ producto.getReferencia()+"','"
                 + producto.getDescripcion()+"','"+ producto.getCosto()+"','"+
                 producto.getPrecio() +"','"+producto.getUbicacionBodega()+"');";
        
    try{
       /*se establece coneccion con la base de datos y se le introduce la consulta*/
        cn = con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sqlUsuario); /*se ejecuta en la base de datos*/
        }catch(SQLException e){}
    }

    public Producto getProducto() {
        return producto;
    }

    public Object[] getDatos() {
        return Datos;
    }
    
    
}


