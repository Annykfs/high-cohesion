package cliente;

public class Converter {

    private Validator validador = new Validator();

    public Integer toInt(String s) {

        boolean resultInt = validador.isInt(s);

        if (resultInt) {
            int i = Integer.parseInt(s);
            return i;
        } else {
            return null;
        }
    }

    public String toString(int i) {

        return "" + i;

    }

}
