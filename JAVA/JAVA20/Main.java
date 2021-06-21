public class Main 
{
    public static void main(String[] args)
    {
        Patient p = new Patient();
        Physician phys = new Physician(p);
        Endocrinologist end = new Endocrinologist(p);
    }
}