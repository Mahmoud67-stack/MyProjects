public interface SubjectAccelerometer 
{
    public void register(ObserverApplication o);
    public void remove(ObserverApplication o);
    public void notify(float[] temp);     
}