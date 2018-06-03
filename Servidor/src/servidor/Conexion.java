package servidor;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {

    public void initServer() {

// declaramos un objeto ServerSocket para realizar la comunicación
        ServerSocket socket;
// creamos una varible boolean con el valor a false
        boolean fin = false;

        try {
// Instanciamos un ServerSocket con la dirección del destino y el
// puerto que vamos a utilizar para la comunicación

            socket = new ServerSocket(6000);

// Creamos un socket_cli al que le pasamos el contenido del objeto socket después
// de ejecutar la función accept que nos permitirá aceptar conexiones de clientes
            Socket socket_cli = socket.accept();

// DataInputStream recibe datos del cliente
            DataInputStream in
                    = new DataInputStream(socket_cli.getInputStream());

// Creamos un bucle do while en el que recogemos el mensaje
// que nos ha enviado el cliente y después lo mostramos
// por consola
            do {
                String mensaje = "";
                mensaje = in.readUTF();
                System.out.println(mensaje);
            } while (1 > 0);
        }
        catch (Exception e) {

// si existen errores los mostrará en la consola y después saldrá del
// programa
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }
}
