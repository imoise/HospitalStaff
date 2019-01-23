/**
 * Write a description of class Surgeon here.
 * This class is the class that contains the Surgeon constructor and Surgeon object methods.
 * This class is the parent class of no other classes.
 * This class's parent is the Doctor class.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Surgeon extends Doctor
{
    // instance variables - replace the example below with your own
    protected boolean isOperating; 

    /**
     * Constructor for objects of class Surgeon
     */
    public Surgeon(String empName, int empNumber, String special, boolean isOper)
    {
         super(empName, empNumber, special);
         isOperating = isOper;

    }
    
    public boolean getIsOperating()
    {
        return isOperating;
    }

    public void setIsOperating(boolean isOper)
    {
        isOperating = isOper;
    }
    
    public String toString()
    {
        String result = super.toString();
        result += "\n" + "Operating:" +  "\t" + isOperating;
        return result;
    }
    
    public void operate()
    {
        if (isOperating == true)
            System.out.println(name + " " + "is operating");
        else
            System.out.println(name + " " + "is not operating");
    }
    
}
