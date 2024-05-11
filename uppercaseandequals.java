public class Person {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize the object with values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("John Doe", 25);

        // Displaying information about the person
        System.out.println("Person 1:");
        person1.displayInfo();

        // Creating another object of the Person class
        Person person2 = new Person("Jane Smith", 30);

        // Displaying information about the second person
        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
