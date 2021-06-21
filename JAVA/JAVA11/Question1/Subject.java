package SoftwareDesign.LAB9.Question1;


public interface  Subject {

    void RegisterObserver(Player o);
    void RemoveObserver(Player o);
    void  NotifyObserver(int i);

}
