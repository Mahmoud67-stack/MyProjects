package SoftwareDesign.Project;

public class Knife_action implements Command {
    private Player player;

    public Knife_action(Player p){
        player=p;
    }
    public void execute(){
        player.knife();
    }
}
