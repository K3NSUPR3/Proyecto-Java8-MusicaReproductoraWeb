 package musica;

//Importante existencia de base de datos
//Los paquetes deben ir por separado pero en un mismo proyecto


//import mysql.jdbc.Statement;
//import datechooser.beans.DateChooserPanel;

import musica.vistafront;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author conor
 */
public class vistafront extends javax.swing.JFrame {

ConectorMySQL conec=new ConectorMySQL();
Connection conectar=conec.Conectar();   
Scanner sc = new Scanner(System.in);
public static String input="",Cancion="",Nombre="",ID=""; 
public  static  int id,segundos;


    public vistafront() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Rellenoart = new javax.swing.JTextField();
        RellenoCan = new javax.swing.JTextField();
        RadioTerminos = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        RellenaNom = new javax.swing.JTextField();
        RellenaId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.darkGray);

        btnAbrir.setBackground(new java.awt.Color(51, 51, 255));
        btnAbrir.setFont(new java.awt.Font("Felix Titling", 3, 24)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(204, 255, 255));
        btnAbrir.setText("Busqueda");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("MUSIK4");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Artista:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Canción:");

        Rellenoart.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        Rellenoart.setForeground(new java.awt.Color(0, 0, 51));
        Rellenoart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoartActionPerformed(evt);
            }
        });

        RellenoCan.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        RellenoCan.setForeground(new java.awt.Color(0, 0, 51));
        RellenoCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoCanActionPerformed(evt);
            }
        });

        RadioTerminos.setBackground(new java.awt.Color(204, 204, 204));
        RadioTerminos.setFont(new java.awt.Font("Britannic Bold", 2, 18)); // NOI18N
        RadioTerminos.setForeground(new java.awt.Color(102, 51, 255));
        RadioTerminos.setText("Acepto Terminos y Condiciones");
        RadioTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioTerminosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Usuario:");

        RellenaNom.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        RellenaNom.setForeground(new java.awt.Color(0, 0, 51));
        RellenaNom.setAlignmentX(0.8F);
        RellenaNom.setAlignmentY(0.8F);
        RellenaNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenaNomActionPerformed(evt);
            }
        });

        RellenaId.setEditable(false);
        RellenaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenaIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 102));
        jLabel7.setText("I.S.C.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RellenoCan)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RellenaNom, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RellenaId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addComponent(Rellenoart)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnAbrir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(RadioTerminos)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RellenaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(RellenaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rellenoart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RellenoCan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(RadioTerminos)
                .addGap(18, 18, 18)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
       //Fuentes https://www.youtube.com/watch?v=63PeIGdRVio
       
         //Se puede tomar un minuto en especifico con los segundos
       
        //https://www.youtube.com/watch?v=sxoQlQ8zfC0
        //obtener el ingreso de los usuarios puro texto
        ID=RellenaId.getText(); 
        Nombre=RellenaNom.getText();
        input = Rellenoart.getText();
        Cancion =RellenoCan.getText();
        
        segundos=Integer.parseInt(JOptionPane.showInputDialog("Ingresar segundos"));
        
        Cancion musica = new Cancion(ID,input,Cancion,segundos);    
    
         //Metodos 
        //importante

        musica.busqueda(input,Cancion);
          
        //secundarios
        musica.reproducir(segundos);
        musica.mostrarInformacion();
        musica.almacenar(Nombre,input ,segundos);

    }//GEN-LAST:event_btnAbrirActionPerformed

 
    
public void Guardar(){   
  //trim anadido para los String
String id=RellenaId.getText().trim(), Nombre=RellenaNom.getText().trim(), Artista=Rellenoart.getText().trim(), Cancion=RellenoCan.getText().trim();
//4 parametros
String Sql="Insert into usuarios values(?,?,?,?)";

    try{
    Statement set = conectar.createStatement();
    //consultas
     ResultSet resultado=set.executeQuery("Select *from usuarios where Id like'"+RellenaId.getText()+"'");
     if(resultado.next()){
         getToolkit().beep();
         JOptionPane.showMessageDialog(null,"Este usuario ya existe");
        
     }else if(RellenaId.getText().isEmpty()){
         getToolkit().beep();
         JOptionPane.showMessageDialog(null,"ID ");
        
     }else{
     PreparedStatement pasar = conectar.prepareStatement(Sql);
     //pasar los datos a la DB
     pasar.setString(1,id);
      pasar.setString(2,Nombre);
      pasar.setString(3,Artista);
      pasar.setString(4,Cancion);
      pasar.executeUpdate();
      
      JOptionPane.showMessageDialog(null, "Registro exitoso");
      
      //cerrar enlace
      conectar.close();
      
      }
     
     } catch(SQLException ex){
         Logger.getLogger(vistafront.class.getName()).log(Level.SEVERE,null,ex);
         JOptionPane.showMessageDialog(null, ex);
  }
    
}//Guarda    
    
    private void RellenoartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoartActionPerformed
                  input=sc.next();        
    }//GEN-LAST:event_RellenoartActionPerformed

    private void RellenoCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoCanActionPerformed
                  Cancion=sc.next();
    }//GEN-LAST:event_RellenoCanActionPerformed

    private void RadioTerminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioTerminosActionPerformed
                         //Si todo salio bien
                          Guardar();
                  JFrame ventana = new JFrame();
                  JOptionPane.showMessageDialog(ventana, "Gracias por aceptar nuestros terminos");
                  
    }//GEN-LAST:event_RadioTerminosActionPerformed

    private void RellenaNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenaNomActionPerformed
         Nombre=sc.next();        
    }//GEN-LAST:event_RellenaNomActionPerformed

    private void RellenaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenaIdActionPerformed
        Random  rand = new Random(0);
        int aleat=rand.nextInt(1000)+6;
        ID=""+aleat+"";
        
        //id guarda entero 
        
        JOptionPane.showInputDialog("Operacion exitosa Estimad@: "+Nombre);
    }//GEN-LAST:event_RellenaIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioTerminos;
    private javax.swing.JTextField RellenaId;
    private javax.swing.JTextField RellenaNom;
    private javax.swing.JTextField RellenoCan;
    private javax.swing.JTextField Rellenoart;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
