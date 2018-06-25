package servidor;

import java.io.DataOutputStream;
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
    
    Jugador jugador1;
    Jugador jugador2;
    Jugador jugador3;
    Jugador jugador4;
    
    public Servidor(int max) {
        _maxJugadores = max;
        _tablero = new Tablero();
    }
    
    public void iniciarJuego(){
        
        // Incializo valores de los jugadores, puede ser en un constructor
        jugador1 = new Jugador();
        jugador1.setNroJugador(1);
        jugador2 = new Jugador(); 
        jugador2.setNroJugador(2);
        jugador3 = new Jugador();
        jugador3.setNroJugador(3);
        jugador4 = new Jugador();
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
                if (jugador1.isPuedeJugar()){
                    while (_mensaje != 1){
                        System.out.println("Esperando mensaje de jugador 1: ");
                        _mensaje = _conn.getInput1().readInt();
                        System.out.println("Mensaje leido de 1: " + _mensaje);
                        jugar(_mensaje, jugador1, _conn.getOutput1());
                    }
                }
                
                _mensaje = 999;
                if (jugador2.isPuedeJugar()){
                    while (_mensaje != 1){
                        System.out.println("Esperando mensaje de jugador 2: ");
                        _mensaje = _conn.getInput2().readInt();
                        System.out.println("Mensaje leido de 2: " + _mensaje);
                        jugar(_mensaje, jugador2, _conn.getOutput2());
                    }
                }
                
                _mensaje = 999;
                if (jugador3.isPuedeJugar()){
                    if (_maxJugadores >= 3){
                        while (_mensaje != 1){
                        System.out.println("Esperando mensaje de jugador 3: ");
                        _mensaje = _conn.getInput3().readInt();
                        System.out.println("Mensaje leido de 2: " + _mensaje);
                        jugar(_mensaje, jugador3, _conn.getOutput3());
                        }    
                    }
                }
                
                _mensaje = 999;
                if (jugador4.isPuedeJugar()){
                    if (_maxJugadores >= 4){
                        while (_mensaje != 1){
                        System.out.println("Esperando mensaje de jugador 4: ");
                        _mensaje = _conn.getInput4().readInt();
                        System.out.println("Mensaje leido de 2: " + _mensaje);
                        jugar(_mensaje, jugador3, _conn.getOutput4());
                        }    
                    }
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("Fin del juego");
    }

    
    public int jugar(int mensaje, Jugador jugador, DataOutputStream output) throws IOException{
        int respuesta = 0;
        switch (mensaje){
            //Mover ficha
            case 2 :
                //LANZO EL DADO Y ACTUALIZO LA POSICION DEL JUGADOR 
                int pasos = lanzarDado(); //Guardo la cantidad de pasos a moverme
                System.out.println("CONTROL - Posicion Inicial: "+jugador.getPos());
                jugador.ActualizarPosicion(pasos, jugador);
                System.out.println("CONTROL - Posicion Final: "+jugador.getPos());
                System.out.println("CONTROL - SALDO: "+jugador.getSaldo());
                //ComprobarCasilla(jugador); ENVIO A COMPROBAR LA CASILLA
                output.writeInt(jugador.getPos());
                break;
            case 30:
                //EL CLIENTE SELECCIONO LA OPCION DE COMPRAR CASILLA
                System.out.println("CONTROL - Saldo Inicial: "+jugador.getSaldo());
                respuesta = jugador.ComprarCasilla(jugador, _tablero);
                System.out.println("CONTROL - Saldo Final: "+jugador.getSaldo());
                break;
            case 31:
                //EL CLIENTE SELECCIONA LA OPCION DE VENDER CASILLA
                System.out.println("CONTROL - Saldo Inicial: "+jugador.getSaldo());
                respuesta = jugador.VenderCasilla(jugador, _tablero);
                System.out.println("CONTROL - Saldo Final: " + jugador.getSaldo());
                break;
            case 32:
                //EL CLIENTE SELECCIONA LA OPCION DE COMPRAR CASA
                System.out.println("CONTROL - Saldo Inicial: "+jugador.getSaldo());
                respuesta = jugador.ComprarCasa(jugador, _tablero);
                System.out.println("CONTROL - Saldo Final: " + jugador.getSaldo());
                break;
            case 33:
                //EL CLIENTE SELECCIONA LA OPCION DE COMPRAR HOTEL
                System.out.println("CONTROL - Saldo Inicial: "+jugador.getSaldo());
                respuesta = jugador.ComprarHotel(jugador, _tablero);
                System.out.println("CONTROL - Saldo Final: " + jugador.getSaldo());
        }
        return respuesta;
        
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
            if (casilla.getDueño() != 0 && casilla.getDueño() != jugador.getNroJugador() ){
              CobrarAlquiler(jugador, casilla, casilla.getDueño());
          }  
        }
        
        else if (tipo.equals("Casualidad") || tipo.equals("Arca")){
            
        }
        
        else if (tipo.equals("Impuesto")){
            
        }
        
        else if (tipo.equals("Vaya_A_Carcel")){
            
        }
        
    }
    
    // Cobrar a un jugador el alquiler de una propiedad
    public void CobrarAlquiler(Jugador jugador, Casilla casilla, int dueñoCasilla){
        switch(dueñoCasilla){
            case 1: jugador1.setSaldo(jugador1.getSaldo()+casilla.getAlquiler());
                    jugador.setSaldo(jugador.getSaldo()-casilla.getAlquiler());
                    break;
            case 2: jugador2.setSaldo(jugador2.getSaldo()+casilla.getAlquiler());
                    jugador.setSaldo(jugador.getSaldo()-casilla.getAlquiler());
                    break;
            case 3: jugador3.setSaldo(jugador3.getSaldo()+casilla.getAlquiler());
                    jugador.setSaldo(jugador.getSaldo()-casilla.getAlquiler());
                    break;
            case 4: jugador4.setSaldo(jugador4.getSaldo()+casilla.getAlquiler());
                    jugador.setSaldo(jugador.getSaldo()-casilla.getAlquiler());
                    break;
        }
        System.out.println("Alguiler cobrado al jugador " +
                jugador.getNroJugador() + ": "+ casilla.getAlquiler());
        verificarQuiebra(jugador, dueñoCasilla);
    }
    
    // Si un jugador queda con saldo negativo al pagar un alquiler a otro jugador
    // sus propiedades son transferidas al jugador que cobró el alquiler junto
    // con todas sus casas y hoteles.
    public void verificarQuiebra(Jugador j, int nuevoDueño){
        if (j.getSaldo() < 0){
            System.out.println("El jugador nro "+ j.getNroJugador()+ " esta en quiebra, "+
                    "sus propiedades seran transferidas al jugador "+ nuevoDueño);
            j.setPuedeJugar(false);
            for (int i=0; i <=39; i++){
                Casilla c = _tablero.getTablero().get(i);
                if (c.getDueño() == j.getNroJugador()){
                    c.setDueño(nuevoDueño);
                    System.out.println("Propiedad transferida: "+i);
                }
            }
        }
    }
    
}
