package SoftwareDesign.Project;

public class Talk_action implements Command{
    private Player player;

    public Talk_action(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.talk();
    }

}
