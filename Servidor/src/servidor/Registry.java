package servidor;

public class Registry {

    public int FIN_DE_TURNO = 1;
    public int MOVER_FICHA = 2;
    
    public int DEVOLVER_SALDO = 15;
    
    public int COMPRAR_CASILLA = 30;
    public int VENDER_CASILLA = 31;
    public int COMPRAR_CASA = 32;
    public int COMPRAR_HOTEL = 33;
    public int ERROR_COMPRA_HOTEL = -1;
    public int ERROR_COMPRA_CASA = -1;
    public int ERROR_VENDER_CASILLA = -1;
    public int AFIRMA_VENDER_CASILLA = 37;
    public int AFIRMA_COMPRAR_CASILLA = 38;
    public int ERROR_COMPRAR_CASILLA = -1;
    
    public int ESTOY_PRESO_MULTA = 20;
    public int ESTOY_PRESO_TARJETA = 21;
    public int ESTOY_PRESO_DADOS = 22;
    
    public int DEVOLVER_NUM_JUGADOR = 40;
    
    public int ERROR_LOGICA_JUGAR = 100;
    
    // de 200 a 239 son las casillas
   
}
