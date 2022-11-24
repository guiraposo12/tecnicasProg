
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kolling and David Barnes
 * @version 2001.05.24
 */
public class Student extends Person
{
    private int credits;


    /**
     * Create a new student with a given name and ID number.
     */
    public Student (String name, String id, int credits) 
    {
        super(name, id);
        credits = 0;
    }


    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }


    public String getLoginName()
    {
        return getName().substring(0,4) + getID().substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(getName() + " (" + getID() + ")");
    }
}
