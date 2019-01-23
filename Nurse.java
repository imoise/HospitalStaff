/**
 * Write a description of class Nurse here.
 * This class is the class that contains the Nurse constructor and Nurse object methods.
 * This class is the parent class of no classes.
 * This class's parent is the HospitalEmployee class.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Nurse extends HospitalEmployee
{
    // Declares numPatients variable as protected in Nurse class
    protected int numPatients;

    //Declares name, number, and number of patients
    public Nurse(String empName,int empNumber, int numPat)
    {
        // initialise instance variables
        super(empName, empNumber);
        numPatients=numPat;
    }
    
    //Getter method that returns the number of patients
    public int getNumPatients()
    {
        return numPatients;
    }
    
    //Setter method that sets the number of patients to an integer value
    public void setNumPatients(int numPat)
    {
        numPatients=numPat;
    }
    
     //toString method that returns the result and number of patients for the nurse
    public String toString()
    {
        String result = super.toString();
        result += "\n" + "Number of Patients:" + "\t" + numPatients;
        return result;
    }
    
    //assist method that prints the nurse and how many patients they have
    public void assist()
    {
        System.out.println(name + " " + "is a nurse with" + " " + numPatients + " " + "patients");
    }
}
