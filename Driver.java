/**
 * Write a description of class Driver here.
 * This class is the class meant to test the methods of HospitalEmployee, Administrator, Nurse, Doctor, Janitor, and Surgeon.
 * This class is the parent class of no classes.
 * This class derives from no classes that were created in this project.
 * This class was made over the course of the project to test all methods.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Driver
{
    public static void main (String [] args) {
        //HospitalEmployee Class Test Case
        System.out.println("----------Start HospitalEmployee Test Case----------");
        
        //Test to see if HospitalEmployee constructor will succesfully make a HospitalEmployee object.
        HospitalEmployee firstEmployee = new HospitalEmployee ("Philip", 50136);
        System.out.println(firstEmployee.toString() + "\n");
        
        //Test to see if getName and getNumber methods will retrieve employee name and Employee Id number.
        HospitalEmployee secondEmployee = new HospitalEmployee ("Steve", 38653);
        System.out.println(secondEmployee.getName());
        System.out.println(secondEmployee.getNumber() + "\n");
       
        //Test to see if setName and setNumber methods will replace the Employee Name and Employee Id Number that is already stored.
        secondEmployee.setName("Luke");
        secondEmployee.setNumber(97653);
        System.out.println(secondEmployee.getName());
        System.out.println(secondEmployee.getNumber()+ "\n");
        
        //Test to see if toString method will return all the strings.
        System.out.println(secondEmployee.toString() + "\n");
        
        //Test to see if work method is functioning
        secondEmployee.work();
        
        //End of HospitalEmployee Test Case;
        System.out.println("----------End HospitalEmployee Test Case----------");
        
        
       
        //Administrator Class Test Case
        System.out.println("----------Start Administrator Test Case----------");
        
        //Test to see if Administrator constructor will succesfully make Administrator objects.
        Administrator adminOne = new Administrator ("Jacob", 68703, "Business");
        System.out.println(adminOne.toString() + "\n");
        
        //Test to see if HospitalEmployee referense named secondEmployee can be used as reference for Administrator object
        secondEmployee = new Administrator ("Zack", 68703, "Finance");
        
        //Test to see if getDept works
        System.out.println(((Administrator)secondEmployee).getDept() + "\n");
        
        //Test to see if setDept works
        ((Administrator)secondEmployee).setDept("Customer Service");
        System.out.println(((Administrator)secondEmployee).getDept() + "\n");
        
        //Test to see if toString method works.
        System.out.println(((Administrator)secondEmployee).toString() + "\n");
        
        //Test to see if administrate method works
        ((Administrator)secondEmployee).administrate();
        //End of Administrator Test Case;
        System.out.println("----------End Administrator Test Case----------");
        
        
        
         //Janitor Class Test Cases
        System.out.println("----------Start Janitor Test Case----------");
        
        //Test to see if Janitor constructor will succesfully make Janitor objects
        Janitor janOne = new Janitor ("Zeke", 18283, "Bathroom", true);
        System.out.println(janOne.toString() + "\n");
        
        //Test to see if HospitalEmployee referense named secondEmployee can be used as reference for Janitor object
        secondEmployee = new Janitor ("Bill", 98747,"Repair", false);
        
         //Test to see if getIsSweeping method works
        System.out.println(((Janitor)secondEmployee).getIsSweeping() + "\n");
         
        //Test to see if setIsSweeping works
        ((Janitor)secondEmployee).setIsSweeping(true);
        System.out.println(((Janitor)secondEmployee).getIsSweeping() + "\n");
         
        //Test to see if toString method works
        System.out.println(((Janitor)secondEmployee).toString());
        
        //Test to see if sweep method will work 
        ((Janitor)secondEmployee).sweep();
         
        //End of Janitor Test Case;
        System.out.println("----------End Janitor Test Case----------");

        
        
        //Doctor Class Test Cases
        System.out.println("----------Start Doctor Test Case----------");
        
        //Test to see if Doctor constructor will succesfully make Doctor objects.
        Doctor docOne = new Doctor ("House", 17769, "Cardiology");
        System.out.println(docOne.toString() + "\n");
        
        //Test to see if HospitalEmployee reference named secondEmployee can be used as reference for Doctor object
        secondEmployee = new Doctor ("Strange", 98743, "Chiropractic");
        
        //Test to see if getSpecialty works
        System.out.println(((Doctor)secondEmployee).getSpecialty() + "\n");
         
        //Test to see if setSpecialty works
        ((Doctor)secondEmployee).setSpecialty("Anesthesiology");
        System.out.println(((Doctor)secondEmployee).getSpecialty() + "\n");
         
        //Test to see if toString method works
        System.out.println(((Doctor)secondEmployee).toString() + "\n");
         
        //Test to see if diagnose method works.
        ((Doctor)secondEmployee).diagnose();
        
        //End of Doctor Test Case;
        System.out.println("----------End Doctor Test Case----------");
        
        
        
        //Surgeon Class Test Case
        System.out.println("----------Start Surgeon Test Case----------");
        
        //Test to see if Surgeon constructor will succesfully make HospitalEmployee objects.
        Surgeon surgeOne = new Surgeon ("Jacob", 22564, "Cardiology", false );
        System.out.println(surgeOne.toString() + "\n");
       
        //Test to see if HospitalEmployee referense named secondEmployee can be used as reference for Surgeon object
        secondEmployee = new Surgeon ("Kelly", 91235, "Pediatric", true);
       
        //Test to see if getIsOperating methods work.
        System.out.println(((Surgeon)secondEmployee).getIsOperating()+"\n");
        
        //Test to see if operate method works
        ((Surgeon)secondEmployee).operate();
        System.out.println("");
        
        //Test to see if setIsOperating methods work.
        ((Surgeon)secondEmployee).setIsOperating(false);
        System.out.println( ((Surgeon)secondEmployee).getIsOperating()+ "\n");
        
        //Test to see if toString method will print out
        System.out.println( ((Surgeon)secondEmployee).toString() + "\n");

        //Test to see if operate method will work if false
         ((Surgeon)secondEmployee).operate();

        //End of Surgeon Test Case;
        System.out.println("----------End Surgeon Test Case----------"); 
        
        
        
        //Nurse Class Test Cases
        System.out.println("----------Start Nurse Test Case----------");
        
        //Test to see if Nurse constructor will succesfully make Nurse objects.
        Nurse nurseOne = new Nurse ("Marie", 17769, 4);
        System.out.println(nurseOne.toString() + "\n");
        
        //Test to see if HospitalEmployee referense named secondEmployee can be used as reference for Nurse object
        secondEmployee= new Nurse ("Anna", 98743, 7);
        
        //Test to see if getNumPatients works
        System.out.println(((Nurse)secondEmployee).getNumPatients() + "\n");
         
        //Test to see if setNumPatients works
       ((Nurse)secondEmployee).setNumPatients(5);
        System.out.println(((Nurse)secondEmployee).getNumPatients() + "\n");
         
        //Test to see if toString method works
        System.out.println(((Nurse)secondEmployee).toString());
        
        //Test to see if assist method will work 
        ((Nurse)secondEmployee).assist();
         
        //End of Nurse Test Case;
        System.out.println("----------End Nurse Test Case----------");
       
        
        
       
     
    }
    
    
}
