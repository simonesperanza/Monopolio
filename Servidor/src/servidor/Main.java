package servidor;

public class Main {

    public static void main(String[] args) {
/*
        Conexion conn = new Conexion();
        conn.initServer();
*/
        Servidor server = new Servidor();
        server.iniciarJuego();
    }
}
