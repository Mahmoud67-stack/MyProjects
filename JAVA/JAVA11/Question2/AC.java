package SoftwareDesign.LAB9.Question2;

import java.util.*;

public class AC extends ConcreteObserver {
      ConcreteSubject instance;

    // make constructor private so no else can call it from outside
     AC(ConcreteSubject subject) {
        super(subject);
    }
    // one static method which can be called without creating an instance
    // of the class.
    Random r = new Random();
    public void update(String season) {
        System.out.println("The season is "+season);
        if (season.equals("Summer")) {
            System.out.println("AC is on");
        }
       else{
                System.out.println("AC is off");
            }
        }
    }

