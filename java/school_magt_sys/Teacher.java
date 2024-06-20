package school_magt_sys;
/**
 * class keeps track of teacher's id, name and salary
 */

public class Teacher
{
    private int id;
    private String name;
    private int salary;

/**
 * This constructor creates a new teacher
 * with id, name and salary
 * @param id teacher's id
 * @param name Teacher's name
 * @param salary teacher's salary
 */
    public Teacher(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        // we will require a setter for the salary cause it will keep changing
        this.salary=salary;
    }

    /**
    * @return getName returns the name of current teacher
    */
    public String getName()
    {
        return name;
    }

    /**
     * @return getId returns the current teacher's id
     */

    public int getId()
    {
        return id;
    }

    /**
     * @return the salary of the current teacher
     */
    public int getSalary()
    {
        return salary;
    }

    /**
     * sets the salary
     * @param salary current salary
     */
    public void setSalary(int salary)
    {
        this.salary=salary
    }
}