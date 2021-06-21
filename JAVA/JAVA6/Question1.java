package SoftwareDesign.LAB3;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //a)
        System.out.print("Please enter the number of avengers: ");
        int n = obj.nextInt();

        //b)
        System.out.println("Please enter the " + n + " Avengers names: ");
        obj.nextLine();
        //c)
        try {
            FileOutputStream outfile = new FileOutputStream("avengers.txt");
            for (int i = 0; i < n; i++) {
                outfile.write(obj.nextLine().getBytes());
                outfile.write('\n');
            }
            System.out.println("Successfully wrote to the file.");
            outfile.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
