package school_magt_sys;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 */

public class Main {
    public static void main(String[] args)
    {
        Teacher godwin = new Teacher(12106,"Okoeguale Godwin",80000);
        Teacher bola = new Teacher(22106,"Abimbola Godwin Taiwo",80000);
        Teacher simon = new Teacher(32106,"Okeguale Simon", 60000);

        //creating a list from the teacher objects
        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(godwin);
        teacherList.add(bola);
        teacherList.add(simon);

        Student john = new Student(012106,"John Blake",10);
        Student rockwell = new Student(022106,"Juju Rockwell",12);
        Student abby = new Student(032106,"Sarah Abby",11);

        List<Student> studentList= new ArrayList<>();
        studentList.add(john);
        studentList.add(rockwell);
        studentList.add(abby);

        School HenBridge= new School(teacherList, studentList);
        int money = HenBridge.getTotalMoneyEarned();
        System.out.println(money);

        // List<Teacher> all_teachers=HenBridge.getTeachers();
        // System.out.println(all_teachers)

        abby.payFees(5000);
        john.payFees(15000);
        System.out.println("HenBridge has earned $"+ HenBridge.getTotalMoneyEarned());

        System.out.println("----HENBRIDGE paying Salary----");
    }
}