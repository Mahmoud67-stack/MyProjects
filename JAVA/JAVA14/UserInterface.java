package SoftwareDesign.LAB12;

public class UserInterface extends ConcreteObserver implements Runnable {

    Thread t;
    UserInterface(Subject [] subjects)
    {
        super(subjects);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void update(Message msg) {
        super.update(msg);
    }

    @Override
    public void run() {

    }
}
