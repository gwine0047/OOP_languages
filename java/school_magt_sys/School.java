package school_magt_sys;

import java.util.ArrayList;
import java.util.List;
/**
 * accomodate for many teachers and students
 * this list create a list of datatype of teacher and student
 * and will hold the list of students or teachers that will
 * be passed to them
 */

public class School
{
    //making a method static makes it easy to access without instantiation
    // so the static variable can be accessed by other classes without instatiation
    private List<Teacher> teachers; //datatype or class Teacher
    private List<Student> students; //datatype or class Student
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //constructor
    //make sure to pass an array list of teachers and students

    /**
     * created as soon as a new school object is created.
     * @param teachers: list of teachers
     * @param students: list of students
     */
    public School(List<Teacher> teachers, List<Student> students)
    {
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    //use getters and setters for variables that will change

    /**
     * returns teachers (list)
     */
    public List<Teacher> getTeachers()
    {
        return teachers;
    }

    /**
     * returns students (list)
     */
    public List<Student> getStudents()
    {
        return students;
    }

    /**
     * returns totalMoneyEarned (list)
     */
    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }

    /**
     * returns totalMoneySpent (list)
     */
    public int getTotalMoneySpent()
    {
        return totalMoneySpent;
    }

    //setters
    //remember we created lists named teachers and students
    //we just create add methods to add each student or each teacher to this list

    /**
     * adds a teacher object to the school
     * @param teacher: the teacher to be added
     */
    public void addTeacher(Teacher teacher)
    {
        //teachers is a list of Teacher objects
        teachers.add(teacher);
    }

    /**
     * adds a student object to the school
     * @param student: the student to be added
     */
    public void addStudent(Student student)
    {
        //student is a list of Student object
        students.add(student);
    }

    /**
     * updates total money earned
     * @param MoneyEarned is the current money earned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned)
    {
        totalMoneyEarned+=MoneyEarned;
    }

    /**
     * updates total money spent
     * @param MoneySpent is the current money earned
     */
    public void updateTotalMoneySpent(int MoneySpent)
    {
        totalMoneySpent-=MoneySpent;
    }
}