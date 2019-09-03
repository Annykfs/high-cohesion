package cliente;

import java.io.IOException;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException, IOException {

        Connection connection = new Connection(2626, "localhost");//Objeto de conexão

        Printer printer = new Printer();//Objeto de impressão

        Reader socketReader = new Reader(connection.getInputStream());//Objeto de leitura do socket

        Reader keyboardReader = new Reader(System.in);//Objeto de leitura do teclado

        Writer socketWriter = new Writer(connection.getOutputStream());//Objeto de leitura do socket

        Converter conversor = new Converter();

        Menu menu = new Menu();

        while (true) {
            int num = menu.show(); //mostrando o menu e retornando um num int
            //mudando o nome da variavel
            String numString = conversor.toString(num); // convertendo o numero que será recebido no menu de INT para STRING
            socketWriter.write(numString); //enviando para o server

            if (num == 2) {
                break;
            } else if(num == 1){
            String valorRecebido = socketReader.readLine();
            printer.print(valorRecebido);
            }
        }

        connection.close();

    }
}
