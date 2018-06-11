package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
    
    static final int PUERTO = 6000;
    int _maxJugadores;

//  Declaramos un objeto ServerSocket para realizar la comunicación
    ServerSocket serverSocket;
    
    DataInputStream _input1;
    DataInputStream _input2;
    DataInputStream _input3;
    DataInputStream _input4;

    DataOutputStream _output1;
    DataOutputStream _output2;
    DataOutputStream _output3;
    DataOutputStream _output4;
    
    public Conexion(int max){
        _maxJugadores = max;
    }
    
    
/**
 * Inicia los sockets y streams de comunicacion del servidor
 */
public void initServer() {

    try {
    // Instanciamos ServerSocket con el puerto que vamos a utilizar
    // para la comunicación con cada cliente
    serverSocket = new ServerSocket(PUERTO);

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
    
    if (_maxJugadores >= 3){
        Socket socket_cli3 = serverSocket.accept();
        _input3 = new DataInputStream(socket_cli3.getInputStream());
        _output3 = new DataOutputStream(socket_cli3.getOutputStream());
    }
    
    if (_maxJugadores >= 4){
        Socket socket_cli4 = serverSocket.accept();
        _input4 = new DataInputStream(socket_cli4.getInputStream());
        _output4 = new DataOutputStream(socket_cli4.getOutputStream());
    }
    
    System.out.println("Conectados los " + _maxJugadores + " clientes\n");
    
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

    public DataInputStream getInput3() {
        return _input3;
    }

    public DataInputStream getInput4() {
        return _input4;
    }

    public DataOutputStream getOutput3() {
        return _output3;
    }

    public DataOutputStream getOutput4() {
        return _output4;
    }
    
    
    
    
}
