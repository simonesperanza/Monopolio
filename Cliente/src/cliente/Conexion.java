package cliente;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Conexion {

    public void initClient(){

// Creamos una instancia BuffererReader en la
// que guardamos los datos introducido por el usuario
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

// declaramos un objeto socket para realizar la comunicación
        Socket socket;

        String mensaje = "";

        try {

// Instanciamos un socket con la dirección del destino y el
// puerto que vamos a utilizar para la comunicación
            socket = new Socket("127.0.0.1", 6000);

// Declaramos e instanciamos el objeto DataOutputStream
// que nos valdrá para enviar datos al servidor destino
            DataOutputStream out
                    = new DataOutputStream(socket.getOutputStream());

// Creamos un bucle do while en el que enviamos al servidor el mensaje
// los datos que hemos obtenido despues de ejecutar la función
// "readLine" en la instancia "in"
            do {
                mensaje = in.readLine();
// enviamos el mensaje codificado en UTF
                out.writeUTF(mensaje);
// mientras el mensaje no encuentre la cadena fin, seguiremos ejecutando
// el bucle do-while
            } while (!mensaje.startsWith("fin"));
        }
        catch (Exception e) {
// si existen errores los mostrará en la consola y después saldrá del
// programa
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
