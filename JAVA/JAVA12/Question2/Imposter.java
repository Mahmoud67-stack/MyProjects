package SoftwareDesign.LAB10.Question2;

public class Imposter extends Crewmate{

    Imposter(String color)
    {
        this.ActB=new sus();
        this.KillB=new dokill();
        this.TaskB = new Bad();
        this.color = color;
        t = new Thread(this);
        t.start();
    }
}
