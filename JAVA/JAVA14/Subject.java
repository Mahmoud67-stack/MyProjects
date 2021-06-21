package SoftwareDesign.LAB12;


public interface Subject {

    void RegisterObserver(Observer o);
    void RemoveObserver(Observer o);
    void publishMessage(Message msg);

}
