package SoftwareDesign.LAB5.Question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public abstract class SalesRepresentative {
    String name, company, email;
    int salary, age;

    SalesRepresentative() {
    }

    SalesRepresentative(String name, String company, String email, int salary, int age) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void takeordersfromphone(FileOutputStream outfile) {
        System.out.println(name + " is answering the phone");
        Scanner obj = new Scanner(System.in);
        int input;
        try {
            outfile.write('\n');
            outfile.write('\n');
            outfile.write("Phone".getBytes());
            while ((input = obj.nextInt()) != -1) {
                outfile.write('\n');
                outfile.write(String.valueOf(input).getBytes());
            }
        } catch (Exception e) {
            System.out.println("File error");
        }
        System.out.println(name + " is recording the new orders in the company record.");
    }

    void takeordersfromemail(FileInputStream inputStream, FileOutputStream outputStream) {
        System.out.println(name + " is reading his emails");
        try {
            outputStream.write("Email".getBytes());
            outputStream.write('\n');
            int i = 0;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (Exception e) {
            System.out.println("File error");
        }
        System.out.println(name + " is recording the new orders in the company record.");
    }

    @Override
    public String toString() {
        return name + "is a " + age + " year old Sales Representative who works at " + company + ". He makes\n" +
                "$" + salary + " a year. His email is " + email;
    }
}
