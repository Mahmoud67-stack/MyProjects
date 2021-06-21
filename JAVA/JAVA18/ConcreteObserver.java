package SoftwareDesign.QUIZ2;

public class ConcreteObserver implements Observer {
    private Subject subject;
    public ConcreteObserver(Subject subject)
    {
        this.subject = subject;
    }
    @Override
    public void update(Customer c) {}
}

