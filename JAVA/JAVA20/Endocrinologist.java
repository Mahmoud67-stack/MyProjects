import java.util.*;
public class Endocrinologist extends Doctor 
{
    Endocrinologist(SubjectPatient s)
    {
        super("Endocrinologist", s);
    }
    public void updateDr(Patient patient, int temp)
    {
        if(temp < 98)
        {
            System.out.println(patient.getThread().getName() +  " temprature is " + temp + " and was examined by " + this.name + " on " + new Date().toString());
        }
    }
}