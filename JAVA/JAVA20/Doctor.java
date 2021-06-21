public abstract class Doctor implements ObserverDoctor
{
    String name;
    private SubjectPatient subject;
    Doctor(String n, SubjectPatient s)
    {
        name = "Dr. " + n;
        subject = s;
        subject.register(this);
    }
}