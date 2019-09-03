package servidor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {

    private ServerSocket servidor;
    private Socket cliente;

    public Connection(int porta) throws IOException {

        this.servidor = new ServerSocket(porta);

    }

    public Socket getSocket() throws IOException {    //método do socket   
        return cliente;
    }

    public Socket aguardandoConexao() throws IOException {    //método para aguardar conexão      
        this.cliente = servidor.accept();
        return cliente;
    }

    public ServerSocket getServerSocket() {
        return null;
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
