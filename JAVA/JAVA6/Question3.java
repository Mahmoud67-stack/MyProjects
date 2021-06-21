package SoftwareDesign.LAB3;

import java.util.Scanner;

class Human {
    String name, gender;
    int age;

    Human(int age, String name, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class King extends Human {
    String kingdom;

    King(int age, String name, String gender, String kingdom) {
        super(age, name, gender);
        this.kingdom = kingdom;
    }
}

class TheBlackPanther extends King implements Superhero {
    TheBlackPanther(int age, String name, String gender, String kingdom) {
        super(age, name, gender, kingdom);
    }

    @Override
    public void defend(String villain) {
        System.out.println("The Black Panther is defending " + kingdom + " from " + villain + "\n");
    }

    @Override
    public String toString() {
        String t = "The Black Panther called " + name + " is a " + age + "-years old and" + gender + " human, and a king who rules the kingdom of " + kingdom;
        return t;
    }
}

public class Question3 {

    public static void main(String[] args) {
        TheBlackPanther TChalla = new TheBlackPanther(43, "TChalla", "male", "Wakanda");

        System.out.println(TChalla);
        System.out.println("Who’s threatening the peace of Wakanda?");
        Scanner obj = new Scanner(System.in);
        TChalla.defend(obj.nextLine());
    }
}
