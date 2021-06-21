package SoftwareDesign.Project;

public class Controlroom extends Room {


    Controlroom(Player player, Guard [] guards, TCP_Client tcp) {
        super(4, player, guards, tcp);
        player.Rkey.setDone(true);
        new Story().end();
    }

}
