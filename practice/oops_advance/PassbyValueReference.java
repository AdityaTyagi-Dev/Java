// Java is ALWAYS pass-by-value
// Pass-by-Value means a copy of the variable is passed to the method, Changes inside the method don't affect the original variable directly.

class Student {
    int marks;
}

public class PassbyValueReference {
    static void change(Student s) {
        s.marks = 90;
    }
    static void change(int x) {
        x = 100;
    }

    static void changed(Student s) {
        s = new Student();
        s.marks = 100;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.marks = 50;
        change(st);
        System.out.println(st.marks);  // output- 90
        
        int a = 10;
        change(a);
        System.out.println(a); // output- 10

        // Why did the value of variable didn't change, but the value of object changed ??
        // When calling 'change(a);' Java copies the value of a to x. So, x changes, but a stays unchanged.
        // and in case of 'change(st);', it changes because Java passes a copy of the reference.
        // **Java does NOT pass the actual object. Java passes a copy of the reference**
        // Both references point to the same reference

        Student st2 = new Student();
        st2.marks = 50;
        changed(st2);
        System.out.println(st2.marks);  // output- 50

        // Because 's = new Student();' only changes the local copy of the reference. Original st still points to old object.


        // Primitive - Copy of data
        // Object - Copy of address or reference

        // Real life analogy
        // Original reference = original address slip
        // Java gives method a photocopy of the address slip
        // Both slips point to the same house.
        // If you repaint the house -> visible everywhere.
        // If you change the photocopy to another address -> original slip unaffected.
    }
}
