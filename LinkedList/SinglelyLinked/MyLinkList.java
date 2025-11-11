package Linklist1;

import java.util.Scanner;

public class MyLinkList {
    Node start;
    Scanner sc = new Scanner(System.in);

    // Add at First Position
    private void addFirst(int data) {
        Node temp = new Node(data);
        temp.next = start;
        start = temp;
        System.out.println("Data added at first.");
    }

    // Add at Last Position
    public void addLast(int data) {
        Node temp = new Node(data);
        if (start == null) {
            start = temp;
        } else {
            Node itr = start;
            while (itr.next != null) {
                itr = itr.next;
            }
            itr.next = temp;
        }
        System.out.println("Data added at last.");
    }

    // Add at specific position
    private void addPosition(int data) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos <= 1 || start == null) {
            addFirst(data);
            return;
        }

        Node temp = new Node(data);
        Node itr = start;

        for (int i = 1; i < pos - 1 && itr.next != null; i++) {
            itr = itr.next;
        }

        temp.next = itr.next;
        itr.next = temp;
        System.out.println("Data added at position " + pos);
    }

    // Menu-based add method
    public void add() {
        boolean ch = true;

        while (ch) {
            System.out.println("\n1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add at Specific Position");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            switch (choice) {
                case 1:
                    addFirst(data);
                    break;
                case 2:
                    addLast(data);
                    break;
                case 3:
                    addPosition(data);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\nDo you want to continue?");
            System.out.println("1. Yes\t2. No");
            
            int cont = sc.nextInt();
            if (cont == 1)
                ch = true;
            else
                ch = false;
        }
    }

    
 // ================= DELETE FUNCTIONS =================

    private void deleteFirst() {
        if (start == null) {
            System.out.println("List is empty, nothing to delete.");
        } else {
            System.out.println("Deleted data: " + start.getData());
            start = start.next;
        }
    }

    private void deleteLast() {
        if (start == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        if (start.next == null) {
            System.out.println("Deleted data: " + start.getData());
            start = null;
            return;
        }

        Node itr = start;
        while (itr.next.next != null) { // stop before last node
            itr = itr.next;
        }
        System.out.println("Deleted data: " + itr.next.getData());
        itr.next = null;
    }

    private void deletePosition() {
        if (start == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (pos <= 1) {
            deleteFirst();
            return;
        }

        Node itr = start;
        for (int i = 1; i < pos - 1 && itr.next != null; i++) {
            itr = itr.next;
        }

        if (itr.next == null) {
            System.out.println("Invalid position!");
            return;
        }

        System.out.println("Deleted data: " + itr.next.getData());
        itr.next = itr.next.next;
    }

    // ================= MENU-BASED DELETE =================
    public void delete() {
        int choice;
        boolean ch = true;

        while (ch) {
            System.out.println("\n1. Delete First");
            System.out.println("2. Delete Last");
            System.out.println("3. Delete at Specific Position");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deleteFirst();
                    break;
                case 2:
                    deleteLast();
                    break;
                case 3:
                    deletePosition();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\nDo you want to continue deleting?");
            System.out.println("1. Yes\t2. No");
            int cont = sc.nextInt();
            if (cont == 1)
                ch = true;
            else
                ch = false;
        }
    }

    // Display method
    public void display() {
        if (start == null) {
            System.out.println("List is Empty.");
        } else {
            Node itr = start;
            while (itr != null) {
                System.out.print(itr.getData() + " -> ");
                itr = itr.next;
            }
            System.out.println("null");
        }
    }
}


