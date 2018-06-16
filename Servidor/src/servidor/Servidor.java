package servidor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Random; // Libreria para generar numeros random



public class Servidor {
    
    Conexion _conn;
    
    Registry reg = new Registry();
    
    // Indica el numero de jugador que tiene el turno (de 1 a 4)
    int _turno;
    // Indica la cantidad de jugadores máximos de la partida
    int _maxJugadores;
    
    int _mensaje = 999;
    int _mensaje2;
    
    public Servidor(int max) {
        _maxJugadores = max;
    }
    
    public void iniciarJuego(){
        
        // Incializo valores de los jugadores, puede ser en un constructor
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
  
        jugador1.saldo = reg.SALDO_INICIAL;
        jugador2.saldo = reg.SALDO_INICIAL;
        
        jugador1.pos[0] = 1;
        jugador2.pos[0] = 1;
        
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
                    jugar(_mensaje, jugador1);
                }
                
                _mensaje = 999;
                while (_mensaje != 1){
                    System.out.println("Esperando mensaje de jugador 2: ");
                    _mensaje = _conn.getInput2().readInt();
                    System.out.println("Mensaje leido de 2: " + _mensaje);
                    jugar(_mensaje, jugador2);
                }
                
                _mensaje = 999;
                if (_maxJugadores >= 3){
                    while (_mensaje != 1){
                    System.out.println("Esperando mensaje de jugador 3: ");
                    _mensaje = _conn.getInput3().readInt();
                    System.out.println("Mensaje leido de 2: " + _mensaje);
                    }    
                }
                
                _mensaje = 999;
                if (_maxJugadores >= 4){
                    while (_mensaje != 1){
                    System.out.println("Esperando mensaje de jugador 4: ");
                    _mensaje = _conn.getInput4().readInt();
                    System.out.println("Mensaje leido de 2: " + _mensaje);
                    }    
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Fin del juego");
    }

    
    public void jugar(int mensaje, Jugador jugador){
        
        switch (mensaje){
            case 2:
                 //Mover ficha
                //LANZO EL DADO Y ACTUALIZO LA POSICION DEL JUGADOR 
                int pasos = lanzarDado(); //Lanzo el dado y guardo la cantidad de pasos a moverme
                System.out.println(pasos);
                int posIni = Jugador.dondeEstoy(jugador.pos); // Obtengo la posicion inicial del jugador
                System.out.println(posIni);
                jugador.pos[posIni] = 0; //Libero la casilla donde estaba inicialmente
                //COMPRUEBO SI VOY A DAR UNA VUELTA
                if(posIni + pasos < 39){//SI ENTRO ACA, SIGNIFICA QUE NO DI UNA VUELTA
                    jugador.pos[posIni + pasos] = 1; // Marco mi posicion actual
                }else{//SI ENTRO ACA, SIGNIFICA QUE DI UNA VUELTA
                    jugador.pos[pasos - ( 39 - posIni)] = 1; // Marco mi posicion actual
                    jugador.saldo = jugador.saldo + reg.SALDO_VUELTA; //Le aumento al jugador el saldo
                break;   
                }
        }
    }
    
    public int lanzarDado(){
        Random random = new Random();
        int dado = 2 + random.nextInt(11);
        return dado;
    }
    
}
