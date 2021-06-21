package SoftwareDesign.LAB5.Question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Driver {
    public static void main(String[] args) {
        DwightSchrute dwightschrute = new DwightSchrute("Dunder Mifflin Inc.", " dschrute@dundermifflin.com", 40000, 42);
        System.out.println(dwightschrute);
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB5\\Dwight_new_orders.txt");
            FileInputStream inputStream = new FileInputStream("D:\\2020-2021\\SofwareDesign\\src\\SoftwareEngineering\\LAB5\\Question1\\dschrute@dundermifflin.com.txt");
            dwightschrute.takeordersfromemail(inputStream, outputStream);
            dwightschrute.takeordersfromphone(outputStream);
            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        dwightschrute.meetingmanage("Michael");
        dwightschrute.checksonharvest("beetroot");
    }
}
