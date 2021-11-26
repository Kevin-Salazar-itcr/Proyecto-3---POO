package Modelo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danny Jimenez
 */
public class Cliente implements Runnable {

    private final String HOST = "localhost";
    private ObjectOutputStream out;
    private int puerto;
    private Object objeto;

    public Cliente(int puerto, Object objeto){
        this.puerto = puerto;
        this.objeto = objeto;
    }
    

    @Override
    public void run() {
        
        Socket socket;
        try {
            socket = new Socket(HOST, puerto);
            out = new ObjectOutputStream(socket.getOutputStream());
            
            out.writeObject(objeto); 
            
            socket.close();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }

}
