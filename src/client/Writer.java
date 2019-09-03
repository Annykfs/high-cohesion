package cliente;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Writer {

    BufferedWriter bw;

    public Writer(OutputStream outputStream) {
        bw = new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    public void write(String s) throws IOException {
        bw.write(String.format("%s\n", s));
        bw.flush();
    }

    public void writeInt(Integer i) throws IOException {
        bw.write(i);
        bw.flush();
    }

    public void close() throws IOException {
        bw.close();
    }

}
