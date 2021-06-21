package SoftwareDesign.Project;


public interface  Subject {

    void RegisterObserver(Observer o);
    void RemoveObserver(Observer o);
    void  NotifyObserver(int z);

}
