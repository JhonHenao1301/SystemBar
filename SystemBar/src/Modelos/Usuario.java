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
public class Usuario {
    
    int     idUser;
    String  nombreUser;     /* 20 */
    String  apellidoUser;   /*20 */
    String  cargoUser;       /* 20 */
            
    public Usuario(){
    }
    
    public Usuario(int idUser,String nombreUser, String apellidoUser, String cargoUser){
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.cargoUser = cargoUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public String getApellidoUser() {
        return apellidoUser;
    }

    public String getCargoUser() {
        return cargoUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public void setApellidoUser(String apellidoUser) {
        this.apellidoUser = apellidoUser;
    }

    public void setCargoUser(String cargoUser) {
        this.cargoUser = cargoUser;
    }
    
    
}
