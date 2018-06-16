package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
// Comentario de prueba
    public static void main(String[] args) {
/*
        Conexion conn = new Conexion();
        conn.initServer();
*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduzca cantidad de jugadores: ");
            int totalJugadores = Integer.parseInt(in.readLine());
            Servidor server = new Servidor(totalJugadores);
            server.iniciarJuego();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
