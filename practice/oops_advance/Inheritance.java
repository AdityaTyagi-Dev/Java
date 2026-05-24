// Inheritance is one of the key features of OOP.

// It allows us to derive new classes (subclasses) from an existing class (superclass).


class Animal { // superclass
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("I am an animal");
        System.out.println("I can eat");
    }
}

class Dog extends Animal { // subclass
    Dog(String name) {
        super(name);  // this will call the parent or superclass constructor
    }
    void display() {
        System.out.println("My name is " + this.name);
    }

    @Override // not mandatory, but it tells compiler that you are overriding intentionally and considered a good practice
    void eat(){  // this will given priority if the object is of subclass
        System.out.println("I am a dog");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fenton");

        dog1.eat();

        dog1.display();


        Animal cat1 = new Animal("Meow");
        cat1.eat();

        // cat1.display(); -> give an error as there is no display() for any object of class Animal

        // Subclass can use the field of superclass but superclass cannot use the field of subclass
        // In Java, inheritance is an is-a relationship.
        // -Rectange is a polygon
        // -Orange is a fruit
    }
}