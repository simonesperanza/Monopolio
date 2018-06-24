package servidor;

public class Jugador {
    private boolean puedeJugar;
    private int nroJugador;
    private char usuario;
    private char pass;
    private int pos = 0;
    private float saldo = 1500;
    private boolean turno = false;  
    
    public void ActualizarPosicion(int pasos, Jugador jugador){
        int movimiento = jugador.getPos() + pasos;
        if(movimiento <= 39){ //NO DI UNA VUELTA SOLO ACTUALIZO POSICION
            jugador.setPos(movimiento);
        }else{ //DI UNA VUELTA, ACTUALIZO LA POSICION + AGREGO EL FEED POR DAR LA VUELTA
            jugador.setPos(movimiento - 40);
            jugador.setSaldo(jugador.getSaldo() + 200);
        }
    }
    
    public int ComprarCasilla(Jugador jugador, Tablero tablero){
        int msg;
        Casilla casilla = tablero.getTablero().get(jugador.getPos());
        if( jugador.getSaldo() >= casilla.getPrecio() && casilla.getDueño()==0){
            msg = 38;
            jugador.setSaldo( jugador.getSaldo()- casilla.getPrecio());
            casilla.setDueño(jugador.getNroJugador());
        }else{
            msg = 39;
        }
        return msg;
    }
    
    public int VenderCasilla(Jugador jugador, Tablero tablero){
        int msg=37;
        Casilla casilla = tablero.getTablero().get(jugador.getPos());
        if(casilla.getDueño()==jugador.getNroJugador()){
            casilla.setDueño(0);//LIBERO LA CASILLA
            casilla.setHotel(false);//LIBERO LA CASA
            casilla.setCasa(false);// LIBERO HOTEL
            jugador.setSaldo(jugador.getSaldo()+ (casilla.getPrecio()/2) );//RETORNO LA MITAD DEL DINERO DE LO QUE INICIALMENTE VALIA LA PROPIEDAD            
        }else
            msg=36;
        return msg;
    }
    
    public int ComprarCasa(Jugador jugador, Tablero tablero){
        int msg = 35;
        Casilla casilla = tablero.getTablero().get(jugador.getPos());
        Casilla casilla1 = tablero.getTablero().get(casilla.getConjunto1());
        if(jugador.getPos() != 39 && jugador.getPos() != 37 && jugador.getPos() != 3 && jugador.getPos() != 1){
            Casilla casilla2 = tablero.getTablero().get(casilla.getConjunto2());
            if(casilla.getDueño()==jugador.getNroJugador() && casilla1.getDueño()==jugador.getNroJugador() && casilla2.getDueño()==jugador.getNroJugador()){ //COMPRUEBO QUE SOY EL DUEÑO DE ESAS CASILLAS
                jugador.setSaldo(jugador.getSaldo()-casilla.getPrecioCasa());
                msg = 32;
                casilla.setCasa(true);
            }
        }else{
            if(casilla.getDueño()==jugador.getNroJugador() && casilla1.getDueño()==jugador.getNroJugador()){ //COMPRUEBO QUE SOY EL DUEÑO DE ESAS CASILLAS
                jugador.setSaldo(jugador.getSaldo()-casilla.getPrecioCasa());
                msg = 32;
                casilla.setCasa(true);
            }
        }
        
        return msg;
    }
    
    public int ComprarHotel(Jugador jugador, Tablero tablero){
        int msg = 34;
            Casilla casilla = tablero.getTablero().get(jugador.getPos());
            Casilla casilla1 = tablero.getTablero().get(casilla.getConjunto1());
            if(jugador.getPos() != 39 && jugador.getPos() != 37 && jugador.getPos() != 3 && jugador.getPos() != 1){
                Casilla casilla2 = tablero.getTablero().get(casilla.getConjunto2());
                if(casilla.getDueño()==jugador.getNroJugador() && casilla1.getDueño()==jugador.getNroJugador() && casilla2.getDueño()==jugador.getNroJugador()){
                    if(casilla.isCasa()==true && casilla1.isCasa()==true && casilla2.isCasa()==true){
                        jugador.setSaldo(jugador.getSaldo()-casilla.getPrecioHotel());
                        msg = 33;
                        casilla.setHotel(true);
                    }
                }
                
            }else{
                if(casilla.getDueño()==jugador.getNroJugador() && casilla1.getDueño()==jugador.getNroJugador()){
                    jugador.setSaldo(jugador.getSaldo()-casilla.getPrecioHotel());
                    msg = 33;
                    casilla.setHotel(true);
                }
            }
        return msg;
    }

    public int getNroJugador() {
        return nroJugador;
    }

    public void setNroJugador(int nroJugador) {
        this.nroJugador = nroJugador;
    }
    
    public char getUsuario() {
        return usuario;
    }

    public void setUsuario(char usuario) {
        this.usuario = usuario;
    }

    public char getPass() {
        return pass;
    }

    public void setPass(char pass) {
        this.pass = pass;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public boolean isPuedeJugar() {
        return puedeJugar;
    }

    public void setPuedeJugar(boolean puedeJugar) {
        this.puedeJugar = puedeJugar;
    }
    
}