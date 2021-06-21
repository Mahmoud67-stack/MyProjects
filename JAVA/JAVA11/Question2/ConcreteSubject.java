package SoftwareDesign.LAB9.Question2;

import java.util.*;

public class ConcreteSubject implements Subject {
    private ArrayList<ConcreteObserver> observers;

    public ConcreteSubject(){
        observers = new ArrayList<ConcreteObserver>();
    }
    @Override
    public void RegisterObserver(ConcreteObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(ConcreteObserver o) {
        int i = observers.indexOf(o);
        if (i>=0) observers.remove(i);

    }

    @Override
    public void NotifyObserver(String x) {
        for (int j =0; j<observers.size(); j++)
        {
            ConcreteObserver observer = observers.get(j);
            observer.update(x);
        }

    }

}