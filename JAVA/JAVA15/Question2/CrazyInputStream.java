package SoftwareDesign.MT1.Question2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CrazyInputStream {

    DataInputStream reader;

    CrazyInputStream(InputStream reader) {
        this.reader = new DataInputStream(reader);
    }

    double readDouble() {
        double i = 0;
        double g = 0;
        try {
            i = reader.readDouble();
            g = reader.readDouble();
        } catch (IOException e) {
            System.out.println(e);
        }
        return i * g;
    }

    float readFloat() {
        float i = 0;
        float g = 0;
        try {
            i = reader.readFloat();
            g = reader.readFloat();
        } catch (IOException e) {
            System.out.println(e);
        }
        return i + g;
    }

    void close() {
        try {
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
