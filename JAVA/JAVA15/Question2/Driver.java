package SoftwareDesign.MT1.Question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Driver {

    public static void main(String[] args) throws Exception {

        CrazyOutputStream cout = new CrazyOutputStream(new FileOutputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\MT1\\Question2\\funny.txt"));

        cout.writeDouble(3);
        cout.writeFloat((float) 4);

        cout.close();

        CrazyInputStream cin = new CrazyInputStream(new FileInputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\MT1\\Question2\\funny.txt"));

        System.out.println(cin.readDouble());
        System.out.println(cin.readFloat());

        cin.close();


    }
}
