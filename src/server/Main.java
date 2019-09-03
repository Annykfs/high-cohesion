package servidor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Printer printer = new Printer(); // iniciando a class obj printer 

        Connection connection = new Connection(2626); //abrindo porta
        printer.print("Aguardando conexão...");//msg orientacao
        connection.aguardandoConexao(); //fazendo a validação da conexão
        printer.print("Conexão efetuada com sucesso!"); //msg orientacao

        //leitor do socket
        Reader socketReader = new Reader(connection.getInputStream()); //chamando leitor com ajuda do método getInputStream() que está contido na class connection 

        Writer writerSocket = new Writer(connection.getOutputStream());//chamando escritor com ajuda do método getOutputStream() que está contido na class connection 

        Reader keyboardReader = new Reader(System.in); //leitor do console

        while (true) {

            String valorEntrada = socketReader.readLine(); //lendo a entrada do socket OBS: TA ENTRANDO

            Calendar calendar = new Calendar();//iniciando o calendar

            String dataFormatadaPrint = calendar.retornandoData(); //BOTANDO A DATA EM UMA STRING PARA DEPOIS USAR NO PRINT

            if (valorEntrada.equals("1")) {
                writerSocket.write(dataFormatadaPrint);  //USANDO O PRINT PARA IMPRIMIR A DATA FORMATADA 
            } else if (valorEntrada.equals("2")) {
                break;
            }

        }

        connection.close();//fechar a conexão

    }

}
