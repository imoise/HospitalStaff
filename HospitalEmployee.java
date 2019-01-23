/**
 * Write a description of class HospitalEmployee here.
 * This class is the class that contains the HospitalEmployee constructor and HospitalEmployee object methods.
 * This class is the parent class of Administrator, Nurse, and Doctor.
 * There are no other created classes that are parent classes for HospitalEmployee.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class HospitalEmployee
{
    /** Instance variable declaration.
     *  Declare instance variables "name" as type string and "number" as type int. 
     *  Instance variable "name" will be used to store a name (first name generally, but last names can be used also) of each hospital employee (one name per employee).
     *  Instance variable "number" will be used to store a number that represents the Employee Id of each hospital employee (one Id per employee).
     */
    protected String name;
    protected int number;

    /** Constructor for objects of class "hospitalEmployee".
     *  Objects of the hospitalEmployee class contain one String named "empName" and an int named "empNumber" as parameters. 
     *  The user-inputed String "empName" is stored in the instance variable String "name".
     *  The user-inputed String "empNumber" is stored in the instance variable int "number".
     */
    public HospitalEmployee(String empName, int empNumber)
    {
        name = empName;
        number = empNumber;
    }
    
    //Getter method for hospitalEmployee that retrieves employee name.
    public String getName ()
    {
        return name;
    }
    
    //Setter method for hospitalEmployee that sets the employee name as inputted String.
    public void setName (String empName)
    {
        name = empName;
    }
    
    //Getter method for hospitalEmployee that retrieves employee Id number.
    public int getNumber ()
    {
        return number;
    }
    
     //Setter method for hospitalEmployee that sets the employee name as inputted integer.
    public void setNumber (int empNumber)
    {
        number = empNumber;
    }
    
    //Returns string result describing hospitalEmployee object, but doesn't print to screen.
    public String toString ()
    {
        String result;
        result = "Name:" + "\t" + name + "\n";
        result += "Employee Number:" + "\t" + number;
        return result;
    }
    
    //Method that prints to console the employee name and the String "works at the hospital" works in
    public void work ()
        {System.out.println( name + " " + "works at the hospital.");
    }
}
