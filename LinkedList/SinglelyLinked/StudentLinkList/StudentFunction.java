package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentFunction 
{
		
	ArrayList<Student> students = new ArrayList();
	
	void addStudent(int rollNo, String name, int marks) 
	{
		Student s = new Student(rollNo,name,marks);
		students.add(s);
        System.out.println("Student added successfully.\n");
	} 
	
	void searchRoll(int roll) 
	{
		for(Student std : students) 
		{
			if(std.rollNo == roll) 
			{
                System.out.println("Student Found:");
			}
		}
	}
	
	void displayTopper() 
	{
		boolean found = false;
		for(Student std : students) 
		{
			if(std.marks > 80) 
			{
                System.out.println("Student Found and marks is : " + std.marks);
                found = true;
			}
		}
		
		if (!found) {
            System.out.println("No toppers found.");
        }
		
	}
	
	// Sort by marks
    public void sortByMarks() {
        Collections.sort(students, new Comparator<Student>() {// anonymous class 
            @Override
            public int compare(Student a, Student b) {
                return a.marks - b.marks;
            }
        });

        System.out.println("Sorted by marks:");
        for (Student s : students) {
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
            //the sort function uses the comparator is interface which use compare method to compare 
            //the data or object 
        }
    }
}
