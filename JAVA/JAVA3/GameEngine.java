package SoftwareDesign.HW3;


import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) {

        System.out.println("Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids " +
                "\nto magical Mischief-Makers are proud to present THE MARAUDER'S MAP" +
                "\n\nSay the magic phrase to reveal the map.");

        Scanner obj = new Scanner(System.in);

        while (!obj.nextLine().equals("I solemnly swear that I am up for no good")) {
            System.out.println("Those are not the correct words try again: ");
        }

        Player.getInstance(Watch.getInstance(), new Spell());

    }
}
