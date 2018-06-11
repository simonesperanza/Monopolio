package servidor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    
    Registry reg;// = new Registry();
    Conexion _conn;
    
    // Indica el numero de jugador que tiene el turno (de 1 a 4)
    int _turno;
    // Indica la cantidad de jugadores máximos de la partida
    int _maxJugadores;
    
    int _mensaje;
    int _mensaje2;

    
    
    public Servidor(int max) {
        _maxJugadores = max;
    }
    
    public void iniciarJuego(){
    
        try {
            _conn = new Conexion(_maxJugadores);
            _conn.initServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        while (_mensaje != 0){
            try {
                //Reseteando el mensaje
                _mensaje = 999;
                while (_mensaje != 1){
                System.out.println("Esperando mensaje de jugador 1: ");
                _mensaje = _conn.getInput1().readInt();
                System.out.println("Mensaje leido de 1: " + _mensaje);
                }
                
                _mensaje = 999;
                while (_mensaje != 1){
                System.out.println("Esperando mensaje de jugador 2: ");
                _mensaje2 = _conn.getInput2().readInt();
                System.out.println("Mensaje leido de 2: " + _mensaje2);
                }
                
                _mensaje = 999;
                if (_maxJugadores >= 3){
                    while (_mensaje != 1){
                    System.out.println("Esperando mensaje de jugador 3: ");
                    _mensaje2 = _conn.getInput3().readInt();
                    System.out.println("Mensaje leido de 2: " + _mensaje2);
                    }    
                }
                
                
                _mensaje = 999;
                if (_maxJugadores >= 4){
                    while (_mensaje != 1){
                    System.out.println("Esperando mensaje de jugador 4: ");
                    _mensaje2 = _conn.getInput4().readInt();
                    System.out.println("Mensaje leido de 2: " + _mensaje2);
                    }    
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Fin del juego");
    }

    
    
    
}
