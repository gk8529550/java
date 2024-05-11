public class Student {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize the object with values
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Function to set additional information for the student
    public void setAdditionalInfo(String additionalInfo) {
        System.out.println("Setting additional information: " + additionalInfo);
        // You can perform any additional initialization or processing here
    }

    // Method to display information about the student
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the Student class using constructor
        Student student1 = new Student("Alice", 20);

        // Displaying information about the student
        System.out.println("Student 1:");
        student1.displayInfo();

        // Initializing additional information through a function
        student1.setAdditionalInfo("Computer Science major");

        // Creating another object of the Student class using constructor
        Student student2 = new Student("Bob", 22);

        // Displaying information about the second student
        System.out.println("\nStudent 2:");
        student2.displayInfo();

        // Initializing additional information through a function
        student2.setAdditionalInfo("Mathematics major");
    }
}
