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
    
    Tablero _tablero;
    
    public Servidor(int max) {
        _maxJugadores = max;
        _tablero = new Tablero();
    }
    
    public void iniciarJuego(){
        
        // Incializo valores de los jugadores, puede ser en un constructor
        Jugador jugador1 = new Jugador();
        jugador1.setNroJugador(1);
        Jugador jugador2 = new Jugador(); 
        jugador2.setNroJugador(2);
        Jugador jugador3 = new Jugador();
        jugador3.setNroJugador(3);
        Jugador jugador4 = new Jugador();
        jugador4.setNroJugador(4);
        
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
                    jugar(_mensaje, jugador3);
                    }    
                }
                
                _mensaje = 999;
                if (_maxJugadores >= 4){
                    while (_mensaje != 1){
                    System.out.println("Esperando mensaje de jugador 4: ");
                    _mensaje = _conn.getInput4().readInt();
                    System.out.println("Mensaje leido de 2: " + _mensaje);
                    jugar(_mensaje, jugador3);
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
            //Mover ficha
            case 2 :
                //LANZO EL DADO Y ACTUALIZO LA POSICION DEL JUGADOR 
                int pasos = lanzarDado(); //Guardo la cantidad de pasos a moverme
                jugador.ActualizarPosicion(pasos, jugador);
                System.out.println("CONTROL - Posicion Final: "+jugador.getPos());
                System.out.println("CONTROL - SALDO: "+jugador.getSaldo());
                break;
        }
        
    }
    
    public int lanzarDado(){
        Random random = new Random();
        int dado = 2 + random.nextInt(11);
        return dado;
    }
    
    public void ComprobarCasilla(Jugador jugador){
        
        int posicion = jugador.getPos();
        Casilla casilla = _tablero.getTablero().get(posicion);
        String tipo = casilla.getTipo();
        
        if (tipo.equals("Solar") || tipo.equals("Ferrocarril") || tipo.equals("Servicio")){
          //if (casilla.getDueño() != 0 && casilla.getDueño() != )  
        }
        
        else if (tipo.equals("Casualidad") || tipo.equals("Arca")){
            
        }
        
        else if (tipo.equals("Impuesto")){
            
        }
        
        else if (tipo.equals("Vaya_A_Carcel")){
            
        }
        
    }
    
}
