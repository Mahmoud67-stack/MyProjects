package SoftwareDesign.HW2;


import java.util.Scanner;

public class UserInterface implements Runnable {
    Thread t;
    Scanner inputStream;
    String input;// Here we tried to use the input stream in the run method as a thread using this string
    String output; // Here we tried to use the output stream in the run method as a thread using this string
    boolean checki, checko; // Here we were trying to check if we are reading or writing or do nothing (both false) using these booleans parameters

    UserInterface() {
        inputStream = new Scanner(System.in);


        checki = false;
        checko = false;
        System.out.println("Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids " +
                "\nto magical Mischief-Makers are proud to present THE MARAUDER'S MAP" +
                "\n\nSay the magic phrase to reveal the map.");

        while (!inputStream.nextLine().equals("I solemnly swear that I am up for no good")) {
            write("Those are not the correct words try again: ");
        }
        input = "";
        output = "";
        t = new Thread(this);
        t.start();
    }

    /*    synchronized void write(String output) {

            checko = true;
            this.output = output;
        }

        void writerun() {
            if (checko) {
                System.out.println(output);
                checko = false;
            }
        }

        String read() {
            checki = true;

            while (checki) ;
            return input;
        }

        void readrun() {
            if (checki) {
                this.input = inputStream.nextLine();
                checki = false;
            }
        }*/
    void write(String something) {
        System.out.println(something);
    }

    String read() {
        return inputStream.nextLine();
    }

    @Override
    public void run() {
        //Introducing the player to the game
       /* while (true) {
            writerun();
            readrun();
        }*/
    }
}

