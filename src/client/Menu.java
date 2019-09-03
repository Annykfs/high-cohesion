package cliente;

import java.io.IOException;

public class Menu {

    private Printer printer = new Printer();
    private Reader reader = new Reader(System.in);
    private Converter converter = new Converter();
    private Integer num;

    public int show() throws IOException {

        while (true) {

            printer.print("Digite 1 para receber DATA E HORA; Digite 2 para SAIR;");
            String line = reader.readLine();

            this.num = converter.toInt(line); //Desnecessária essa conversão pois irei trabalhar com strings RETIRAR!!1

            if (num != null || num == 1 || num == 2) {
                break;
            }

        }

        return num;

    }

    public Integer getNum() {
        return num;
    }

}
