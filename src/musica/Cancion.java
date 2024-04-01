//Kenneth Gutiérrez Flores
package musica;
//Librerias necesarias
import java.awt.Desktop; //pendiente de revisar la libreria
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import java.util.Random;

public class Cancion {
    // atributos
  private String nombre;
  private String Canciones;
  private String ID;
  private int duracion;
  private   String ElUrl;

 
    //Constructor           parametros
    public Cancion(String ID,String nombre, String Canciones, int duracion) {
        this.nombre = nombre;
        this.Canciones = Canciones;
        this.duracion = duracion;
        this.ID=ID;
    }
      
                                    //  se ejecuta en modo de lo que ingrese el usuario                       
    public void reproducir(int segundos) {
        System.out.println("Reproduciendo..." + nombre + Canciones +" - "+segundos);
    }//Reproductor

                                    // Al finalizar un print
    public void mostrarInformacion() {
        System.out.println("Artista: " + nombre);
        System.out.println("Duración: " + duracion + " segundos");
    }//Simulador

    //Respaldo sin conexion
public void almacenar(String usuario,String valor , int segundos) {
 //Fuente:https://www.youtube.com/watch?v=ONXc2a0u4cc consulta
        try {
            //Donde localizar el archivo y gaurdarlo de manera  "permanente"
            FileWriter writer = new FileWriter("C:/Users/conor/Downloads/BD/datos.txt");

            //Valor
            writer.write(ID+"\t Usuario:"+usuario+" ingreso: "+valor+" duracion: "+segundos+" segundos");

            //Cerrar el archivo para no ejecutar consumo de Ram
            writer.close();

        } catch (IOException b) {
            System.out.println(b);
      } 
            
   }//almacena

public void busqueda(String nombre, String Canciones){
   //Fuentes:https://www.youtube.com/watch?v=oNTjr917cMw
   System.out.println("Buscando...");
          if(java.awt.Desktop.isDesktopSupported()){
             java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
               if(desktop.isSupported(java.awt.Desktop.Action.BROWSE))
               { 
        try {
         // importa > Desktop desktop = Desktop.getDesktop();
            //Url con navegador predeterminado
            // Se puede cambiar a yt o spotify
             // se ejecuta un metodo para buscar los argumentos en un navegador
            desktop.browse(new URI("https://www.google.com/search?q="+nombre+Canciones));
         //Error de la url o de la entrada 
        } catch (URISyntaxException | IOException ex)  {
//Caso de error de sintaxis o sin conexión        
      }
    }
   }
   
   
  }//busqueda 

/*/ 2   QUEDO PENDIENTE
public void YT(String nombreCanci, int seg) throws IllegalArgumentException{

     ElUrl = "https://www.youtu.be="+nombreCanci+"t"+seg+"/t";
     
     try {
          Desktop escritorio = Desktop.getDesktop();
            //Url yt con navegador predeterminado
           // cambiar a 
           
          if(seg<0) {
           throw new ArithmeticException("No se puede elegir los terminos negativos flotantes");
          }
          else{
          
          escritorio.browse(new URI(ElUrl));
          }
          
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(exception);
      }

}
/*/
    
//https://www.youtube.com/watch?v=nlYiP57A8pk
   
}//Cancion
