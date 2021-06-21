package SoftwareDesign.LAB10.Question2;

public class Normal extends Crewmate {

    Normal(String color){

        this.ActB=new innocent();
        this.KillB=new nokill();
        this.TaskB = new Good();
        this.color = color;
        t = new Thread(this);
        t.start();
    }
}
