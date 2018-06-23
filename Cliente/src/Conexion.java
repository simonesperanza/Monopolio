

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Conexion {

    static final int PUERTO = 6000;
    Socket socket;
    
    DataOutputStream _out;

    public void initClient() {
    // Creamos una instancia BuffererReader en la
    // que guardamos los datos introducido por el usuario
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int mensaje;

        try {
            socket = new Socket("127.0.0.1", PUERTO);
            _out = new DataOutputStream(socket.getOutputStream());
            /*do {
                System.out.println("Enviar mensaje: ");
                mensaje = Integer.parseInt(in.readLine());
                out.writeInt(mensaje);
            } while (mensaje != 0);
            System.out.println("Juego terminado.");*/
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public DataOutputStream getOut() {
        return _out;
    }
    
    
    
}