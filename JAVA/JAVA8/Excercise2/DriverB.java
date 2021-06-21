package SoftwareDesign.LAB6.Excercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverB {
    public static void main(String[] args) {
        InputStreamReader ob = new InputStreamReader(System.in);
        Rachel rachel = new Rachel(new BufferedReader(ob));
        System.out.println(rachel);
        try {
            System.out.println("What would you like to have today? ");
            rachel.takeOrders();
            rachel.readOrders();
        } catch (IOException e) {
            System.out.println("The order was not read");
        }
    }
}
