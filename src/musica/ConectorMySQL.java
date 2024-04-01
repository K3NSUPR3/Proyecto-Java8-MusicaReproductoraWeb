package musica;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**   
  se importan archivos al my sql localizado en la memoria estatica
 */
public class ConectorMySQL {
     public Connection Conectar(){
      Connection conect=null;
         try {
           Class.forName("org.gjt.mm.mysql.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/registro","root","");
         
         } catch (Exception exp) {
             JOptionPane.showMessageDialog(null,"Error no esta activada la base de datos.");         
                  }
       return conect;
      
     }
    
}
