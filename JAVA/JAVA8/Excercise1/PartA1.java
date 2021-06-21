package SoftwareDesign.LAB6.Excercise1;

import java.io.*;
import java.util.Scanner;

public class PartA1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hi, we have new pumpkin spice muffins! ");

        System.out.println("How much would you like to try (e.g 1.5)? ");

        Scanner obj = new Scanner(System.in);

        float nofpumins = obj.nextFloat();

        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB6\\notepad.txt"));
            out.writeFloat(nofpumins);
            System.out.println("Order noted!");
        } catch (IOException e) {
            System.out.println("The order was not noted");
        }

        try {
            DataInputStream in = new DataInputStream(new FileInputStream("notepad.txt"));
            float order = in.readFloat();
            System.out.println("You ordered " + order + " muffins.");
        } catch (IOException e) {
            System.out.println("The order was not noted");
        }
    }
}
