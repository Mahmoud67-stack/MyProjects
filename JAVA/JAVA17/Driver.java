package SoftwareDesign.Quiz1;

public class Driver {
    public static void main(String[] args) {
        Dwarves dwarves = new Dwarves("Mikel", 156, "Male");

        Elves elves = new Elves("Erica", 301, "Female");

        Ents ents = new Ents("Groot", 89, "Male");

        Men men = new Men("Sameera", 45, "Female");

        System.out.println("The free poeple we have are: " +
                dwarves + "\n" + elves + "\n" + ents + "\n" + men + "\n\n");

        dwarves.characteristics();
        System.out.println();
        elves.characteristics();
        System.out.println();
        ents.characteristics();
        System.out.println();
        men.characteristics();

    }
}
