package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {

    private BufferedReader br;

    public Reader(InputStream inputStream) {
        this.br = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String readLine() throws IOException {
        String line = br.readLine();
        return line;
    }

    public void close() throws IOException {
        br.close();
    }

}
