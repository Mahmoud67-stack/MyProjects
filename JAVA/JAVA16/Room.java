package SoftwareDesign.Project;


public abstract class Room {
    int location;

    Guard[] guards;

    Player player;

    TCP_Client tcp;

    Room(int location, Player player, Guard[] guards, TCP_Client tcp) {
        this.location = location;
        this.player = player;
        this.guards = guards;
        this.tcp = tcp;
    }
/*    final void map()
    {
        look();
        fight();
        make_potions();
        next();
}
 */
}
