/**
 * Write a description of class Janitor here.
 * This class is the class that contains the AJanitor constructor and Janitor object methods.
 * This class is no parent class to any classes.
 * This class's parent is the Administrator class.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Janitor extends Administrator
{
    //Declares variable sweeping as a boolean
    protected boolean sweeping;

    //Declares Janitor class using the boolean sweeping variable
    public Janitor(String empName, int empNumber,String dept, boolean sw)
    {
        // Initialize instance variables
        super(empName,empNumber, dept);
        sweeping=sw;
    }
    // Getter method that returns the sweeping variable
    public boolean getIsSweeping()
    {
        return sweeping;
    }
    // Setter method that sets the sweeping value as boolean
    public void setIsSweeping(boolean isS)
    {
        sweeping=isS;
    }
    // toString mehod that returns result
    public String toString()
    {
        String result = super.toString();
        result += "\n" + "Janitor is sweeping:" + "\t" + sweeping;
        return result;  
    }
    
    //sweep method that prints whether the janitor is sweeping
    public void sweep()
    {
       if (sweeping == true)
            System.out.println(name + " " + "is sweeping");
        else
            System.out.println(name + " " + "is not sweeping");
    }
}
