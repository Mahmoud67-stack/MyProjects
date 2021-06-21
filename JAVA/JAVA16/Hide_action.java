package SoftwareDesign.Project;

public class Hide_action implements Command {

    private Player player;

    public Hide_action(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.hide();
    }

}
