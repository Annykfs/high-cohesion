package cliente;

public class Validator {

    public Validator() {

    }

    public boolean isInt(String s) {

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }

    }

}
