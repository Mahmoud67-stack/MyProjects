package SoftwareDesign.LAB10.Question2;

class nokill extends KillBehaviour{

    @Override
    public void kill(String color) {
        System.out.println(color + " is a good crewmate who does not kill");
    }
}
class dokill extends KillBehaviour{

    @Override
    public void kill(String color) {
        System.out.println(color+ " is killing crewmates " );
    }
}
public abstract class KillBehaviour {
    abstract void kill(String color);
}
