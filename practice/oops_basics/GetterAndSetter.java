class Test {

    // private attribute
    private String name;

    // getter method
    String getName() {
        return this.name;
    }

    // setter method
    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
        } else {
            this.name = name;
        }
    }

    // In Java, this keyword is used to refer to the current object inside a method or a constructor
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Test t1 = new Test();

        // access the private variable
        t1.setName("Java Programming");
        System.out.println(t1.getName());
    }

}
