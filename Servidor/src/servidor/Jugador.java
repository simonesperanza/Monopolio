package servidor;

public class Jugador {
    private char usuario;
    private char pass;
    private int pos = 0;
    private float saldo = 1500;
    private boolean turno = false;  
    
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
    
    public void ActualizarPosicion(int pasos, Jugador jugador){
        int movimiento = jugador.pos + pasos;
        if(movimiento <= 39){ //NO DI UNA VUELTA SOLO ACTUALIZO POSICION
            jugador.pos = movimiento;
        }else{ //DI UNA VUELTA, ACTUALIZO LA POSICION + AGREGO EL FEED POR DAR LA VUELTA
            jugador.pos = movimiento - 40;
            jugador.saldo = jugador.getSaldo() + 200;
        }
    }
    
}
