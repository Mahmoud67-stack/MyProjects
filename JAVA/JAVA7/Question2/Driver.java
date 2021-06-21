package SoftwareDesign.LAB5.Question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Driver {

    public static void main(String[] args) {
        PamBeesly pam = new PamBeesly("Dunder Mifflin Inc.", "no email", 30, 1000);
        MichaelScott mich = new MichaelScott("Dunder Mifflin Inc.", "no email", 34, 1000);
        try {
            FileInputStream fin = new FileInputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB5\\Dwight_new_orders.txt");

            pam.readorders(fin);
            FileOutputStream fout = new FileOutputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB5\\Dwight_new_orders.txt");
            mich.Approved();
            pam.outfordispatch(fout);

            fin.close();
            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
