// In Java, an interface is a fully abstract class
// An interface - contains abstract methods, default methods and cannot contain fields


interface Language {  // we have created an interface named Language

    public void getName(String name); // It includes an abstract method getName(), now any class that implements Language should provide an implementation for getName().
    default void sayHello() {   // This can also be overrided
        System.out.println("Hello Java");
    }
}
interface Programming {

    public void code();
    public void showError();
}

// A class can extend only ONE class but implement MULTIPLE interfaces
class ProgrammingLanguage implements Language, Programming {
    @Override
    public void getName(String name) {
        System.out.println("Language: " + name);
    }
    @Override
    public void code() {
        System.out.println("Started coding");
    }
    @Override
    public void showError() {
        System.out.println("It's an error");
    }
}
public class Interface {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
        language.code();
        language.sayHello();
        language.showError();
    }
}
