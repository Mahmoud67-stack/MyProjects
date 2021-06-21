package SoftwareDesign.LAB6.Excercise1;

import java.io.*;
import java.util.Scanner;

public class PartB1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hi, What is your name?");

        Scanner obj = new Scanner(System.in);

        String name = obj.nextLine();

        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB6\\notepad.txt"));
            out.writeUTF(name);
            out.close();
        } catch (IOException e) {
            System.out.println("The file does not exist2");
        }

        try {
            DataInputStream in = new DataInputStream(new FileInputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB6\\notepad.txt"));
            System.out.println("Welcome to Central Perk, " + in.readUTF());
            in.close();
        } catch (IOException e) {
            System.out.println("The file does not exist1");
        }
    }
}
