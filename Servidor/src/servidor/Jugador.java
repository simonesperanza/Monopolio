package servidor;

public class Jugador {
    public char usuario;
    public char pass;
    public int pos[] = new int [40];
    public float saldo;
    public boolean turno = false;

public static int dondeEstoy(int Pos[]){
        int dondeEstoy=0;
        boolean bandera = true;
        int i = 0;
        while(bandera){
            if(Pos[i]==1){
                dondeEstoy = i;
                bandera = false;
            }else{
                i++;
            }
        }
        return dondeEstoy;
    }
}
