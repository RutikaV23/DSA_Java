//Student Management using Collections
//Store Student objects in ArrayList<Student>
//Attributes: roll, name, marks
//Menu:
//✔ Add student
//✔ Search by roll
//✔ Display toppers (marks > 80)
//✔ Sort by marks

package student;

import java.util.Scanner;

public class StudentMain{
    public static void main(String[] args) {

    	StudentFunction sm = new StudentFunction();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Management Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Search by Roll");
            System.out.println("3. Display Toppers (>80)");
            System.out.println("4. Sort by Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    sm.addStudent(roll, name, marks);
                    break;

                case 2:
                    System.out.print("Enter Roll to Search: ");
                    int r = sc.nextInt();
                    sm.searchRoll(r);
                    break;

                case 3:
                    System.out.println("Toppers (marks > 80):");
                    sm.displayTopper();
                    break;

                case 4:
                    sm.sortByMarks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
