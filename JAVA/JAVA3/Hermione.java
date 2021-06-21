package SoftwareDesign.HW3;

public class Hermione extends ConcreteObserver {
    Player player;
    Hermione(Player player) {
        super(player);
        this.player = player;
        player.RegisterObserver(this);

    }

    @Override
    public void update() {
        if (player.getLocation().equals("Library")) {
            System.out.println("Hermione: Harry I am here!");

            player.RemoveObserver(this);
        }
    }

}
