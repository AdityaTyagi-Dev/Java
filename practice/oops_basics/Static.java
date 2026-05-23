class Student {
    // static field
    static String subject;
    static void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}

public class Static {
    public static void main(String[] args) {
        // access the static field/method
        Student.subject = "Computer Science";
        Student.displaySubject();
    }

    // sometimes we want attributes and methods that are common to all objects of a class. In such cases, we can use the static keyword to create static fields and methods.
}
