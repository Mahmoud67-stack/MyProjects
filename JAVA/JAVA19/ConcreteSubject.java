package SoftwareDesign.SampleExamFinal;

import java.util.ArrayList;
public class ConcreteSubject implements Subject{

    private ArrayList observers;

    public ConcreteSubject(){
        observers = new ArrayList();
    }

    public void notifyObservers(State state) {
        for (int i =0; i<observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update();
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObsever(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0) observers.remove(i);
    }
}
