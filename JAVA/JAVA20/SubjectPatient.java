
public interface SubjectPatient 
{
    public void register(ObserverDoctor o);
    public void remove(ObserverDoctor o);
    public void notify(int temp);   
}