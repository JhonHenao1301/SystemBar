/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systembar;
import Control.ControlProducto;
import Modelos.Conexion;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jhon Henao
 */
public class CrearProducto extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn = null;
    Statement s = null;
    ResultSet rs = null;
    DefaultTableModel modelo;
    int id;
    ControlProducto controlP = new ControlProducto();
 
    public CrearProducto() {
        
        this.setVisible(true);
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }
    
    void listar(){
        
        modelo = (DefaultTableModel)TablaDatos.getModel();
        /*Se almacena la consulta sql en un string*/
        String sql = "SELECT * FROM Producto;";
        
        try{
             cn = con.getConnection();
             s = cn.createStatement();
             rs = s.executeQuery(sql);
             Object[]Producto = new Object[6];
             
             while (rs.next()){
                 Producto[0] = rs.getInt("codigo");
                 Producto[1] = rs.getString("referencia");
                 Producto[2] = rs.getString("descripcion");
                 Producto[3] = rs.getString("costo");
                 Producto[4] = rs.getString("precio");
                 Producto[5] = rs.getString("ubicacionBodega");
                 modelo.addRow(Producto);
             }
             TablaDatos.setModel(modelo);
           } catch(SQLException e){    }
    }
    
    void limpiarTabla(){
        
        for(int i=0; i<= TablaDatos.getRowCount(); i++){ 
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void nuevo() {
	
        cjTxtCod.setText("");
	cjTxtRef.setText("");
        cjTxtDes.setText("");
	cjTxtCosto.setText("");
        cjTxtPre.setText("");
        cjTxtUbi.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        botonCrear = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        cjTxtCod = new javax.swing.JTextField();
        cjTxtRef = new javax.swing.JTextField();
        cjTxtCosto = new javax.swing.JTextField();
        cjTxtDes = new javax.swing.JTextField();
        cjTxtPre = new javax.swing.JTextField();
        cjTxtUbi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));
        setResizable(false);

        JPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        JPanelFondo.setPreferredSize(new java.awt.Dimension(600, 700));

        jPanel2.setBackground(new java.awt.Color(0, 200, 150));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Artículo nuevo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        botonCrear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonCrear.setText("Crear");
        botonCrear.setPreferredSize(new java.awt.Dimension(100, 30));
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setPreferredSize(new java.awt.Dimension(100, 30));
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        cjTxtCod.setPreferredSize(new java.awt.Dimension(120, 30));

        cjTxtRef.setPreferredSize(new java.awt.Dimension(120, 30));
        cjTxtRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjTxtRefActionPerformed(evt);
            }
        });

        cjTxtCosto.setPreferredSize(new java.awt.Dimension(120, 30));

        cjTxtDes.setPreferredSize(new java.awt.Dimension(150, 30));

        cjTxtPre.setPreferredSize(new java.awt.Dimension(150, 30));

        cjTxtUbi.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Código");
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Referencia");
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Costo");
        jLabel11.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Descripción");
        jLabel12.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Precio Venta");
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 30));
        jLabel13.setRequestFocusEnabled(false);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Ubicación");
        jLabel14.setPreferredSize(new java.awt.Dimension(80, 30));

        jPanel1.setBackground(new java.awt.Color(0, 200, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "referencia", "descripcion", "costo", "precio", "ubicacionBodega"
            }
        ));
        TablaDatos.setPreferredSize(new java.awt.Dimension(450, 200));
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(60);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(60);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(60);
            TablaDatos.getColumnModel().getColumn(3).setMinWidth(80);
            TablaDatos.getColumnModel().getColumn(3).setPreferredWidth(80);
            TablaDatos.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        botonEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setPreferredSize(new java.awt.Dimension(100, 30));

        botonNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonNuevo.setText("Nuevo");
        botonNuevo.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout JPanelFondoLayout = new javax.swing.GroupLayout(JPanelFondo);
        JPanelFondo.setLayout(JPanelFondoLayout);
        JPanelFondoLayout.setHorizontalGroup(
            JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
            .addGroup(JPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(JPanelFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cjTxtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cjTxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cjTxtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelFondoLayout.createSequentialGroup()
                        .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelFondoLayout.createSequentialGroup()
                                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cjTxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cjTxtUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPanelFondoLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(JPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cjTxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(JPanelFondoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelFondoLayout.setVerticalGroup(
            JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelFondoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cjTxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cjTxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cjTxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cjTxtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cjTxtUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cjTxtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(JPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        
    }//GEN-LAST:event_botonModificarActionPerformed

    private void cjTxtRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjTxtRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjTxtRefActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        try{
            /*se le asignan los atribujos que se ingreso en las cajas de texto a un objeto usuario*/
            controlP.getProducto().setCodigo(Integer.valueOf(cjTxtCod.getText()));
            controlP.getProducto().setReferencia(cjTxtRef.getText());
            controlP.getProducto().setDescripcion(cjTxtDes.getText());
            controlP.getProducto().setCosto(Integer.valueOf(cjTxtCosto.getText()));
            controlP.getProducto().setPrecio(Integer.valueOf(cjTxtPre.getText()));
            controlP.getProducto().setUbicacionBodega(cjTxtUbi.getText());
                        
            controlP.agregar();/*se ejecuta el metodo que agrega un usuario a la base de datos*/
            limpiarTabla();
        }
            catch(Exception e){}
            
        JOptionPane.showMessageDialog(null,"Usuario registrado con exito");
        listar();
        nuevo();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Inventario newInventario = new Inventario();
        newInventario.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
                                      
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProducto().setVisible(true);
            }
        });
    }
    /*
    void listar(){
        String sql = "select * from Usuario";
        try{
             cn = con.getConnection();
             s = cn.createStatement();
             rs = s.executeQuery(sql);
             Object[]Usuario = new Object[4];
             modelo = (DefaultTableModel)TablaDatos.getModel();
             while (rs.next()){
                 Usuario[0] = rs.getInt("idUser");
                 Usuario[1] = rs.getString("nombreUser");
                 Usuario[2] = rs.getString("apellidoUser");
                 Usuario[3] = rs.getString("cargoUser");
                 modelo.addRow(Usuario);
             }
             TablaDatos.setModel(modelo);
        } catch(Exception e){
          
        }
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JTextField cjTxtCod;
    private javax.swing.JTextField cjTxtCosto;
    private javax.swing.JTextField cjTxtDes;
    private javax.swing.JTextField cjTxtPre;
    private javax.swing.JTextField cjTxtRef;
    private javax.swing.JTextField cjTxtUbi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
