package SoftwareDesign.QUIZ2;

import java.util.*;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;

    private ConcreteSubject(){
         observers = new ArrayList<Observer>();
    }

    @Override
    public void RegisterObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0) observers.remove(i);

    }

    @Override
    public void NotifyObserver(Customer c) {
        for (int j =0; j<observers.size(); j++)
        {
            Observer observer = observers.get(j);
            observer.update(c);
        }

    }

}