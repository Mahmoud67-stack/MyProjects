package SoftwareDesign.LAB9.Question2;

import java.util.*;

public class Heater extends ConcreteObserver {
    ConcreteSubject instance;

    // make constructor private so no else can call it from outside
    Heater(ConcreteSubject subject) {
        super(subject);
    }
    // one static method which can be called without creating an instance
    // of the class.
    Random r = new Random();
    public void update(String season) {
        if (season.equals("Summer")||season.equals("Spring")) {
            System.out.println("Heater is off");
        }
        else{
            System.out.println("Heater is on");
        }
    }
}

