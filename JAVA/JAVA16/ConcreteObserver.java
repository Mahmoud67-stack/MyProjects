package SoftwareDesign.Project;

public class ConcreteObserver implements Observer {
    public Subject subject;

    public ConcreteObserver(Subject subject)
    {
        this.subject = subject;
        subject.RegisterObserver(this);
    }
    @Override
    public void update(int z) {

    }

    @Override
    public void nextState() {

    }
}

