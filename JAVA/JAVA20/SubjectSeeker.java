public interface SubjectSeeker 
{
    public void registerHider(ObserverHiders o);
    public void removeHider(ObserverHiders o);
    public void notifyHider(int x);

}