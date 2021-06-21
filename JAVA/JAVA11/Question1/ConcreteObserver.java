package SoftwareDesign.LAB9.Question1;

public class ConcreteObserver implements Observer {
    private Watch subject;
    public ConcreteObserver(Watch subject)
    {
        this.subject = subject;
    }
    @Override
    public void update(int i) {
        System.out.print("It is "+i+" o'clock. ");
    }
}

