package SoftwareDesign.Project;

import java.util.*;

public class ConcreteSubject implements Subject {
    public ArrayList<Observer> Observers;

    public ConcreteSubject() {
        Observers = new ArrayList<Observer>();
    }

    @Override
    public void RegisterObserver(Observer o) {
        Observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        int i = Observers.indexOf(o);
        if (i >= 0) Observers.remove(i);

    }

    @Override
    public void NotifyObserver(int z) {
        for (int i = 0; i < Observers.size(); i++) {
            Observer observer = Observers.get(i);
            observer.update(z);
        }
    }

}
