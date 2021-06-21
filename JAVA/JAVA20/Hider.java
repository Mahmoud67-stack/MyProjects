public abstract class Hider extends HidingBehavior implements ObserverHiders 
{
    String name;
    private SubjectSeeker subject;
    public Hider(String n, SubjectSeeker s)
    {
        subject = s;
        name = "Hider " + n;
        subject.registerHider(this);
    }  
}