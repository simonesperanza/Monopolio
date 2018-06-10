package servidor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    Conexion _conn;
    
    int _turno;
    int _mensaje;
    int _mensaje2;
    
    public Servidor(Conexion conn) {
        _conn = conn;
    }
    
    public Servidor() {
        
    }
    
    public void iniciarJuego(){
    
        try {
            _conn = new Conexion();
            _conn.initServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        while (_mensaje != 1){
            try {
                System.out.println("Esperando mensaje..");
                _mensaje = _conn.getInput1().readInt();
                _mensaje2 = _conn.getInput2().readInt();
                System.out.println("Mensaje leido de 1: " + _mensaje);
                System.out.println("Mensaje leido de 2: " + _mensaje2);
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Fin del juego");
    }

    
    
    
}
