/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systembar;

import javax.swing.JFrame;

/**
 *
 * @author Jhon Henao
 */
public class SystemBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Login productView = new Login();
        productView.setVisible(true);
        productView.setLayout(null);
        productView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
