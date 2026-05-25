class Parent {
    static void staticMethod() {
        System.out.println("Parent static");
    }

    void instanceMethod() {
        System.out.println("Parent instance");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child static");
    }

    @Override
    void instanceMethod() {
        System.out.println("Child instance");
    }
}

public class StaticDynamic {

    public static void main(String[] args) {
        Parent p = new Child();

        p.staticMethod();  // Uses reference type (Parent) - Static Binding    If static keyword was not present then it will be a dynamic binding
        p.instanceMethod(); // Uses actual object (Child) - Dynamic Binding

        // Imagine a TV remote
        // Button always opens Netflix - Static Binding
        // Button behavior depends on the app is connected - Dynamic Binding
    }
}