package school_magt_sys;
/**
 * Created on 18-06-24
 * This class is responsible for keeping the 
 * tarck of students, name, id, and fees paid
 */
public class Student
{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //NOTE: ALWAYS TRY TO INITIALIZE ALL FIELDS FROM THE CLASS USING A CONSTRUCTOR
    /**
     * The role of the Student constructor is to 
     * create a new student object by initializing.
     * Fees is $30000 per annum
     * Fees paid is initialised to zero
     * @param id if for student: unique.
     * @param name name of the student.
     * @param grade grade of student.
     */
    public Student(int id, String name, int grade)
    {
        // this.id is id from the student class
        // which is initialized to the id provided
        feesPaid=0; //you may use this.feesPaid
        feesTotal=30000
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    // Not to be altered: name & id,
    // so don't create a setter fro them.

    // setter methods
    /**
     * To update student's grade
     * @param grade new grade for student
     */
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    public void updateFeesPaid(int fees)
    {
        /**
         * Add fees to feesPaid field
         * @param fees fees paid by student
         */
        this.feesPaid+=fees;
    }
    //getters

    /**
    * @return getName returns the name of current student
    */
    public String getName()
    {
        return name;
    }

    /**
     * @return getId returns the current student's id
     */

    public int getId()
    {
        return id;
    }

    /**
     * @return the grade of the student
     */
    public int getGrade()
    {
        return grade;
    }

        /**
    * @return getFeesTotal returns the total fees paid
    */
    public int getFeesTotal()
    {
        return feesTotal;
    }

    /**
     * @return getFeesPaid returns the current paid
     */

    public int getFeesPaid()
    {
        return feesPaid;
    }

}