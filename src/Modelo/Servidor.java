package Modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danny Jimenez
 */
public class Servidor extends Observable implements Runnable {

    private int puerto;
    private ServerSocket servidor = null;
    private Socket socket = null;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public Servidor(int puerto) {

        this.puerto = puerto;
    }

    @Override
    public void run() {
        
        
        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Administrador iniciado");
            
            
            while(true){
                
                
                socket = servidor.accept();
                System.out.println("Cliente conectado");
                
                String mensaje = (String) in.readObject();
                
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                
                socket.close();
                System.out.println("Cliente desconectado");
                
            }            
            
            
            
            
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

}
