package SoftwareDesign.LAB7.Question2;

public class Driverb {
    public static void main(String[] args) {
        Flagb flag = new Flagb();


        HumanB humans = new HumanB(flag);

        ZombiesB zombies = new ZombiesB(flag);

        try {
            zombies.t.join();
            humans.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(flag);
    }
}
