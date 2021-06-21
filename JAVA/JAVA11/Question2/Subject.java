package SoftwareDesign.LAB9.Question2;

public interface  Subject {

    void RegisterObserver(ConcreteObserver o);
    void RemoveObserver(ConcreteObserver o);
    void  NotifyObserver(String x);

}
