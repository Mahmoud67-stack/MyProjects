package SoftwareDesign.LAB12;

public class Driver {

    public static void main(String[] args)
    {
        System.out.println("Oh no! Looks like we're going into battle! Ghostbusters, suit up");

        ConcreteSubject[] subjects = {new Spook(), new Player(new TCP_Client("192.168.0.132", 65001))};

        new UserInterface(subjects);

    }
}
