package SoftwareDesign.QUIZ2;


public interface  Subject {

    void RegisterObserver(Observer o);
    void RemoveObserver(Observer o);
    void  NotifyObserver(Customer c);

}
