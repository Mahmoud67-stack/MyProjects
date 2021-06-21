package SoftwareDesign.Project;


import java.util.Scanner;

public class Player extends ConcreteSubject implements Runnable  {


    Command[] actions;

    ControlPanel p;

    boolean key, code, alerted, suppressor, shield;

    int x,y,location;

    Key Rkey;

    Thread t;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    private static Player player;

    private Player(Watch watch) {
        super();
        x=0;y=0; location=0; key = false; code = false; alerted = false; shield = false; suppressor = false;
        Command [] s =  {new Knife_action(this), new Talk_action(this), new Hide_action(this), new Shoot_action(this)};
        actions = s;

        p = new ControlPanel(actions);
            t = new Thread(this);
            t.start();
    }

    public static synchronized Player getInstance(Watch watch)
    {
        if(player == null)
        {
            player = new Player(watch);
        }
        return player;
    }

    public synchronized void setLocation(int location) {
        this.location = location;
    }

    public synchronized int getLocation() {
        return location;
    }

    public void knife(){
        System.out.println("you knife the enemy!");
}

    public void shoot(){
        System.out.println("you shoot the enemy!");
        for(int i=0;i<Observers.size();i++) {
            if(!suppressor) {
                Observers.get(i).nextState();
            }
        }
}

    public void setCode(boolean code) {
        this.code = code;
    }

    public boolean isCode() {
        return code;
    }

    public void talk(){
        System.out.println("you attempt to talk to the enemy...");
    }
    public void hide(){
        System.out.println("you look for a place to hide!");
    }
    @Override
    public void run() {
        while (true) {

                NotifyObserver(location);
            }

        }
    }
