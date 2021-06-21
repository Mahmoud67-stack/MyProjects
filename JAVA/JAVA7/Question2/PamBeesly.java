package SoftwareDesign.LAB5.Question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PamBeesly extends Receptionist implements Artist {
    PamBeesly() {
        super();
    }

    PamBeesly(String company, String email, int age, int salary) {
        super("Pam Beesly", company, email, age, salary);
    }

    void readorders(FileInputStream fin) {

        System.out.println(name + ": ");
        System.out.println("These orders are from Dwight");
        int c = 0;
        //read until EOF
        try {
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    void outfordispatch(FileOutputStream fout) {
        try {
            fout.write("APPROVED!".getBytes());
            System.out.println(name + ":\nthe orders will be sent tot he warehouse for dispatch");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void draw() {
        System.out.println(name + "is drawing stuff");

    }

    @Override
    public String toString() {
        return super.toString() + " and she is an artist.";
    }
}
