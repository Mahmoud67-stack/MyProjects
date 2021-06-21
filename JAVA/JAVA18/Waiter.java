package SoftwareDesign.QUIZ2;

public class Waiter implements Subject, Observer {
    private static Waiter instance;
    Subject subject;

    private Waiter(Subject subject)
    {
        this.subject = subject;
    }

    public static synchronized Waiter getInstance(Subject subject){
        instance = new Waiter(subject);
        return instance;
    }

    @Override
    public void update(Customer c) {
        System.out.println(this.getClass()+" recieved an order from the customer "+ c.getClass());
    }

    @Override
    public void RegisterObserver(Observer o) {

    }

    @Override
    public void RemoveObserver(Observer o) {

    }

    @Override
    public void NotifyObserver(Customer c) {

    }

}
