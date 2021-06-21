package SoftwareDesign.LAB9.Question1;


import java.util.*;

public class Player extends ConcreteObserver {
    private static Player instance;

    // make constructor private so no else can call it from outside
    private Player(Watch subject) {
        super(subject);
        subject.RegisterObserver(this);
    }
    // one static method which can be called without creating an instance
    // of the class.
    public static synchronized Player getInstance(Watch subject){

        if(instance == null){
            instance = new Player(subject);
        }
        return instance;
    }

    Random r = new Random();
    public void update(int i) {
        super.update(i);
        if(i<=19 && i>7)
        {
            if(r.nextInt(2)==1)
            {
                System.out.println(" Time to mine");
            }
            else
            {
                System.out.println(" Time to craft");
            }
        }
        else{
            if(r.nextInt(2)==1)
            {
                System.out.println(" Time to hide");
            }
            else
            {
                System.out.println(" Time to hunt creepers!");
            }
        }
    }
}