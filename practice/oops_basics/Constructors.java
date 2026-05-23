class Student {
    String name;
    int id;
    // Default constructor (no parameters)
    Student() {
        this.name = "Unknown";
        this.id = 0;
    }

    // parameterized constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("John", 5);
        System.out.println("Name: " + s1.name);
        System.out.println("Id: " + s1.id);
    }   
}
