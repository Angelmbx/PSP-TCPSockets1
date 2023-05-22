
/*
Crea un programa servidor que pueda atender hasta 3 clientes.
Debe enviar a cada cliente un mensaje indicando el número de cliente que es.
Este número será 1, 2 o 3. El cliente mostrará el mensaje recibido.
Cambia el programa para que lo haga para N clientes, siendo N un parámetro que tendrás que definir en el programa.
 */

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        //create server socket
        int port = 6000;
        ServerSocket server = new ServerSocket(port,3);
        System.out.println("SERVER set on PORT " + server.getLocalPort() );

        //accept connection for client socket
        Socket client1 = server.accept();
        //send data to client1
        DataOutputStream outputStream = new DataOutputStream(client1.getOutputStream());
        outputStream.writeInt(1);

        Socket client2 = server.accept();
        //send data to client2
        outputStream = new DataOutputStream(client2.getOutputStream());
        outputStream.writeInt(2);

        Socket client3 = server.accept();
        //send data to client3
        outputStream = new DataOutputStream(client3.getOutputStream());
        outputStream.writeInt(3);

        //close streams and sockets
        outputStream.close();
        server.close();
    }


}