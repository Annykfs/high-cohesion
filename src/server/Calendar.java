package servidor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {

    private Date data;
    private String dataFormatada;

    public Calendar() {

        this.data = new Date();

        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy" + "  " + "hh:mm");

        this.dataFormatada = f.format(data);

    }

    public String retornandoData() {
        return dataFormatada;

    }

}
