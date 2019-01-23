/**
 * Write a description of class Tester here.
 * This class is the class meant to test the methods of HospitalEmployee, Administrator, Nurse, Doctor, Janitor, and Surgeon.
 * This class is the parent class of no classes.
 * This class derives from no classes that were created in this project.
 * This test class was taken from Blackboard and modified so the method names would be the same as the ones made.
 * @author (Isaac Moise + Nick Ciccio) 
 * @version (3/1/2017 - 3/9/2017)
 */
public class Tester {
    public static void main(String args[]){
        //first we create a few HospitalEmployees
        //let's make six, but only initialize three
        HospitalEmployee ethan = new HospitalEmployee("Ethan",52504);
        HospitalEmployee jane = new HospitalEmployee("Jane", 54057);
        HospitalEmployee julia = new HospitalEmployee("Julia", 10536);
        HospitalEmployee mike;
        HospitalEmployee denise;
        HospitalEmployee jared;

        //now we're going to view the three we've already initialized
        System.out.println(ethan + "\n" + jane + "\n" + julia);
        //this next line just gives out output more readability
        System.out.println("\n\t-----END BLOCK 1-----\n");

        //next step in initializing our other three employees, let's make them all different
        mike = new Doctor("Mike", 92928, "Internal Medicine");
        denise = new Nurse("Denise", 95189, 9);
        jared = new Administrator("Jared", 15232, "Finance");

        //now we can veiw those new employees
        System.out.println(mike + "\n" + denise + "\n" + jared);
        //for readability
        System.out.println("\n\t-----END BLOCK 2-----\n");

        //clearly this much works, but our first three employees are too generic
        //let's assign two of them to be the last two types of employee
        ethan = new Surgeon("Ethan",52504, "Severe Trauma", true);
        jane = new Janitor("Jane", 54057, "Maintenance", false);
        //as you can see, even though our objects had certain values, preforming polymorphism on them
        //means we need to reassign those values

        //now let's print everyone
        System.out.println(mike + "\n" + denise + "\n" + jared + "\n" + ethan + "\n" + jane + "\n" + julia);
        System.out.println("\n\t-----END BLOCK 3-----\n");
        //if you haven't yet, run the program now
        //now find block 3 in the output
        //as you can see, each different object has different data and prints different amounts of information
        //you can also see that our polymorphism worked

        //at this point, you should try adding more polymorphism to get a hang of it
        //see what methods can and can't be called in each object
        //---------ADD YOUR OWN CODE HERE:

        System.out.println("You should have put some code here");

        System.out.println("\n\t-----END BLOCK 4-----\n");

        //This section tests that every method you're supposed to have exists and works
        HospitalEmployee h = new HospitalEmployee("Employee", 0);
        Doctor d = new Doctor("Doctor", 2, "Pediatrics");
        Nurse n = new Nurse("Nurse", 3, 5);
        Surgeon s = new Surgeon("Surgeon", 4, "Cardiology", false);
        Administrator a = new Administrator("Admin", 5, "Finance");
        Janitor j = new Janitor("Janitor", 6, "Maintenance", true);

        h.work();
        h.setName("HospitalEmployee");
        h.setNumber(1);
        h.setName(h.getName());
        h.setNumber(h.getNumber());
        h.work();

        System.out.println();

        d.diagnose();
        d.setSpecialty("Internal Medicine");
        d.setSpecialty(d.getSpecialty());
        d.diagnose();

        System.out.println();

        n.assist();
        n.setNumPatients(3);
        n.setNumPatients(n.getNumPatients());
        n.assist();

        System.out.println();

        s.operate();
        s.setIsOperating(true);
        s.setIsOperating(s.getIsOperating());
        s.operate();

        System.out.println();

        a.administrate();
        a.setDept("Research");
        a.setDept(a.getDept());
        a.administrate();

        System.out.println();

        j.sweep();
        j.setIsSweeping(false);
        j.setIsSweeping(j.getIsSweeping());
        j.sweep();

        System.out.println("\n\t-----END TEST CASE-----\n");
    }
}