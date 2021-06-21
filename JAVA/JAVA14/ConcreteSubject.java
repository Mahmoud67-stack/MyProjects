package SoftwareDesign.LAB12;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers;

    public ConcreteSubject(){
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
    public void publishMessage(Message m) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(m);
        }
    }

}