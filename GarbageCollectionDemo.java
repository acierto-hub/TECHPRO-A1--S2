import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student Created: " + name);
    }
    
    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector destroying Student object: " + name);
    }
}
 
public class GarbageCollectionDemo {
    public static void main(String[] args) {
        System.out.println("=== Student Record System Started ===");
        
        ArrayList<Student> students = new ArrayList<>();
        
        // Fixed class name capitalization and duplicate IDs
        students.add(new Student(1, "Juan"));
        students.add(new Student(2, "Mario"));
        students.add(new Student(3, "Pedro"));
        
        System.out.println("\n--- Displaying Student Records ---");
        for (Student s : students) {
            s.displayInfo();
        }
        
        System.out.println("\n--- Removing Student Records ---");
        students.remove(0);
        students.remove(0);
        
        System.out.println("\nRequesting Garbage Collection...");
        System.gc();
        
        System.out.println("\n--- Creating Temporary Student Objects ---");
        // Fixed variable declaration syntax
        for (int i = 4; i <= 20; i++) {
            Student temp = new Student(i, "TempStudent" + i);
        }
        
        System.out.println("\n--- Clearing Remaining References ---");
        students = null;
        System.out.println("\nRequesting Garbage Collection...");
        System.gc();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Fixed typo in println
            System.out.println(e);
        }
        System.out.println("\n=== Program Ended ===");
    }
}
this.id
