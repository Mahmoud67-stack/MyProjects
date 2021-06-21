package SoftwareDesign.LAB6.Excercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DriverA {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB6\\Excercise2\\orders.txt");
            Rachel rachel = new Rachel(new BufferedReader(file));
            rachel.takeOrders();
            rachel.readOrders();
            file.close();
        } catch (IOException e) {
            System.out.println("The order was not read");
        }


    }
}
