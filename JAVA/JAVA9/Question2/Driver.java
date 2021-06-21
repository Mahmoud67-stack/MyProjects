package SoftwareDesign.LAB7.Question2;

public class Driver {
    public static void main(String[] args) {
        Flag flag = new Flag();


        Humans humans = new Humans(flag);

        Zombies zombies = new Zombies(flag);

        try {
            zombies.t.join();
            humans.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(flag);
    }
}
