package SoftwareDesign.LAB6.Excercise2;

import java.io.BufferedReader;
import java.io.IOException;

public class Rachel {
    int age;
    String name;
    int orders[];
    BufferedReader reader;

    Rachel(BufferedReader r) {
        age = 30;
        name = "Rachel";
        orders = new int[2];
        reader = new BufferedReader(r);
    }

    void takeOrders() throws IOException {
        String i;

        while ((i = reader.readLine()) != null) {
            if (i.contains("americano")) {
                orders[0]++;
            } else if (i.contains("hot chocolate")) {
                orders[1]++;
            }
            if (i.equals("")) {
                break;
            }
        }
    }

    void readOrders() {
        System.out.println("Alright, so you ordered: ");
        System.out.println("americano: " + orders[0]);
        System.out.println("hot chocolate: " + orders[1]);
    }

    @Override
    public String toString() {
        return "Hi! My name is " + name + " and I am a " + age + " years\n" +
                "old waitress at Central Perk.";
    }
}
