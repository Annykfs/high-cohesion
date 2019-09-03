package servidor;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Writer {

    BufferedWriter bw;

    public Writer(OutputStream outputStream) throws IOException {

        bw = new BufferedWriter(new OutputStreamWriter(outputStream));

    }

    public void write(String s) throws IOException {

        bw.write(String.format("%s\n", s));
        bw.flush();

    }

    public void close() throws IOException {
        bw.close();
    }

}
