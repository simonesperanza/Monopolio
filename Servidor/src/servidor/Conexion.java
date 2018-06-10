package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
    
    static final int PUERTO = 6000;

//  Declaramos un objeto ServerSocket para realizar la comunicación
    ServerSocket serverSocket;
    
    DataInputStream _input1;
    DataInputStream _input2;

    DataOutputStream _output1;
    DataOutputStream _output2;
    
/**
 * Inicia los sockets y streams de comunicacion del servidor
 */
public void initServer() {

    try {
    // Instanciamos ServerSocket con el puerto que vamos a utilizar
    // para la comunicación con cada cliente
    serverSocket = new ServerSocket(PUERTO+1);

    // Creamos un socket_cli para cada cliente, al que le pasamos el contenido
    // del objeto socket después de ejecutar la función accept que nos permitirá
    // aceptar conexiones de clientes
    Socket socket_cli1 = serverSocket.accept();
    Socket socket_cli2 = serverSocket.accept();

    // DataInputStream recibe datos del cliente
    _input1 = new DataInputStream(socket_cli1.getInputStream());
    _input2 = new DataInputStream(socket_cli2.getInputStream());
    
    // DataOutputStream envia datos al cliente
    _output1 = new DataOutputStream(socket_cli1.getOutputStream());
    _output2 = new DataOutputStream(socket_cli2.getOutputStream());
        System.out.println("Conectados los dos clientes\n");
    } catch (Exception e) {
        System.err.println(e.getMessage());
        System.exit(1);
    }

}

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public DataInputStream getInput1() {
        return _input1;
    }

    public DataInputStream getInput2() {
        return _input2;
    }

    public DataOutputStream getOutput1() {
        return _output1;
    }

    public DataOutputStream getOutput2() {
        return _output2;
    }
    
    
}
