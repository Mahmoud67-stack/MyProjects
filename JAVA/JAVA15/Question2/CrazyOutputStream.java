package SoftwareDesign.MT1.Question2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Random;

public class CrazyOutputStream {

    DataOutputStream writer;

    CrazyOutputStream(OutputStream writer) {
        this.writer = new DataOutputStream(writer);
    }

    void writeDouble(double d) {
        Random r = new Random();
        try {
            writer.writeDouble(d);
            writer.writeDouble(r.nextDouble());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void writeFloat(float f) {
        Random r = new Random();
        try {
            writer.writeFloat(f);
            writer.writeFloat(r.nextFloat());
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    void close() {
        try {
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
