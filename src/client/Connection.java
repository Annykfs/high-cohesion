package cliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connection {

    private Socket cliente;

    public Connection(int porta, String ip) throws UnknownHostException, IOException {

        this.cliente = new Socket(InetAddress.getByName(ip), porta); //definindo o que o socket vai precisar   
    }

    public Socket getSocket() {
        return cliente;
    }

    public OutputStream getOutputStream() throws IOException {//retirando a dependencia do output 

        return cliente.getOutputStream();

    }

    public InputStream getInputStream() throws IOException { //retirando a dependencia do input 

        return cliente.getInputStream();

    }

    public void close() throws IOException {
        cliente.close();
    }

}
