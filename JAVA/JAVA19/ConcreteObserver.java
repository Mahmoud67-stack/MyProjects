package SoftwareDesign.SampleExamFinal;

public class ConcreteObserver implements Observer {
    private Subject subject;

    public ConcreteObserver(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(State state) {
        if ()
        System.out.println("");
    }
}
