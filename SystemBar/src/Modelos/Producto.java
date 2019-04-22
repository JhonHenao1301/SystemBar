/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Jhon Henao
 */
public class Producto {
    
    int     codigo;
    String  referencia;     /* 20 */
    String  descripcion;     /* 40 */
    int     costo;
    int     precio;
    int     ubicacionBodega; /* 20 */

    public Producto(){
    }

    public Producto(int codigo,String referencia,String descripcion,int costo,int precio,int ubicacionBodega){
        
        this.codigo = codigo;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precio = precio;
        this.ubicacionBodega = ubicacionBodega;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUbicacionBodega() {
        return ubicacionBodega;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUbicacionBodega(int ubicacionBodega) {
        this.ubicacionBodega = ubicacionBodega;
    }
    
    

}