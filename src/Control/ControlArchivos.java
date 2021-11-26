package Control;

import Modelo.Inventario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danny Jimenez
 */
public class ControlArchivos {
    
    private FileOutputStream fichero = null;
    private ObjectOutputStream tuberia = null;
    private FileInputStream ficheroLectura = null;
    private ObjectInputStream tuberiaLectura = null;

    public ControlArchivos() {
    }
    
    
    public void guardar(Inventario inventario){
        
        try {
            fichero = new FileOutputStream("datos.txt");
            tuberia = new ObjectOutputStream(fichero);
            
            tuberia.writeObject(inventario);
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControlArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControlArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                fichero.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        
        
        
        
    }
    
    public Inventario leer(){
        
        Inventario inventario = null;
        
        
        try {
            
            ficheroLectura = new FileInputStream("datos.txt");
            tuberiaLectura = new ObjectInputStream(ficheroLectura);
            
            inventario = (Inventario) tuberiaLectura.readObject();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControlArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ControlArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                ficheroLectura.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            
        }
            
        
        return inventario;
    }
    
    
    
    
}
