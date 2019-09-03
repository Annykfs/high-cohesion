package servidor;

public class Conversor {

    private Validador validador = new Validador();

    public Integer toInt(String s) {

        boolean result = validador.isInt(s);

        if (result) {
            int i = Integer.parseInt(s);
            return i;
        } else {
            return null;
        }

    }

}
