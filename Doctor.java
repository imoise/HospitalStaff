/**
 * Write a description of class Doctor here.
 * This class is the class that contains the Doctor constructor and Doctor object methods.
 * This class is the parent class of Surgeon.
 * This class's parent is the HospitalEmployee class.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Doctor extends HospitalEmployee
{
    // instance variables - replace the example below with your own
    protected String specialty;

    /**
     * Constructor for objects of class doctor
     */
    public Doctor(String empName, int empNumber, String special)
    {
       super(empName, empNumber);
       specialty = special;
    }

    public String getSpecialty()
    {
        return specialty;
    }
    
    public void setSpecialty(String special)
    {
        specialty = special;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\n" + "Specialty:" + "\t" + specialty;
        return result;
    }
    
    public void diagnose()
    {
        System.out.println(name + " " + "specializes in" + " " + specialty);
    }
}
