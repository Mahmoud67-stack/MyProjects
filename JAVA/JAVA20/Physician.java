import java.util.*;
public class Physician extends Doctor 
{
    Physician(SubjectPatient s)
    {
        super("Physican", s);
    }
    public void updateDr(Patient patient, int temp)
    {
        if(temp > 102)
        {
            System.out.println(patient.getThread().getName() +  " temprature is " + temp + " and was examined by " + this.name + " on " + new Date().toString());
        }    
    }
}