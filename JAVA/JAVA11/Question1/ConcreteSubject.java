package SoftwareDesign.LAB9.Question1;

import java.util.*;

public class ConcreteSubject implements Subject {
    private ArrayList<Player> player;

    public ConcreteSubject(){
         player = new ArrayList<Player>();
    }

    @Override
    public void RegisterObserver(Player o) {
        player.add(o);
    }

    @Override
    public void RemoveObserver(Player o) {
        int i = player.indexOf(o);
        if (i>=0) player.remove(i);

    }

    @Override
    public void NotifyObserver(int i) {
        for (int j =0; j<player.size(); j++)
        {
            Player observer = player.get(j);
            observer.update(i);
        }

    }

}