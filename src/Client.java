/*
Crea un programa servidor que pueda atender hasta 3 clientes.
Debe enviar a cada cliente un mensaje indicando el número de cliente que es.
Este número será 1, 2 o 3. El cliente mostrará el mensaje recibido.
Cambia el programa para que lo haga para N clientes, siendo N un parámetro que tendrás que definir en el programa.
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int port = 6000;

        //connecting socket to server
        Socket clientA = new Socket(host,port);
        //data recieving from server
        DataInputStream inputStream = new DataInputStream(clientA.getInputStream());
        System.out.println("El cliente A es el numero " + inputStream.readInt());
        Socket clientB = new Socket(host,port);
        inputStream = new DataInputStream(clientB.getInputStream());
        System.out.println("El cliente B es el numero " + inputStream.readInt());
        Socket clientC = new Socket(host,port);
        inputStream = new DataInputStream(clientC.getInputStream());
        System.out.println("El cliente C es el numero " + inputStream.readInt());

        //close streams and sockets
        inputStream.close();
        clientA.close();
        clientB.close();
        clientC.close();
    }
}
