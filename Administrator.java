/**
 * Write a description of class Administrator here.
 * This class is the class that contains the Administrator constructor and Administrator object methods.
 * This class is the parent class of Janitor.
 * This class's parent is the HospitalEmployee class.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Administrator extends HospitalEmployee
{
    // Declares String department variable from the Administrator class
    protected String department;

    //Uses the name, number, and department to declare the variables
    public Administrator(String empName, int empNumber, String dept)
    {
       super(empName, empNumber);
       department = dept;
    }

    // Getter method that returns the department
    public String getDept()
    {
        return department;
    }
    
    //Setter method that sets the departments as a String
    public void setDept (String dept)
    {
        department = dept;
    }
    
    //toString method that returns a String named result which contains what department administrator is in
    public String toString()
    {
        String result = super.toString();
        result += "\n" + "Department:" + "\t" + department;
        return result;
    }
    
     //Method that prints to console the name and what department administrator works in
    public void administrate()
    {
        System.out.println(name + " " + "works in the" + " " + department + " " + "department");

    }
}
