package SoftwareDesign.Project;

public class Shoot_action implements Command {
    private Player player;

    public Shoot_action(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.shoot();
    }

}
