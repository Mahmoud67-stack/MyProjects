package SoftwareDesign.LAB9.Question2;

public class ConcreteObserver implements Observer {
    private Subject subject;
    public ConcreteObserver(Subject subject)
    {
        this.subject = subject;
        subject.RegisterObserver(this);
    }
    @Override
    public void update(String x) {

    }
}

